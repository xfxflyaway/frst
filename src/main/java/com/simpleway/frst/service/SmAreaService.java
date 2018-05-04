package com.simpleway.frst.service;

import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.domain.dto.SmAreaExample;
import com.simpleway.frst.domain.vo.SmAreaVo;
import com.simpleway.frst.mapper.SmAreaMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiongfeixiang
 * @title SmAreaService
 * @date 2017/10/3 9:55
 * @since v1.0.0
 */
@Service
public class SmAreaService {

	@Resource
	SmAreaMapper smAreaMapper;

	public List<SmAreaVo> getListById(Long id) throws Exception {
		return getChildAreaList(id);
	}

	/**
	 * 递归获取区域树型数据，获取所有，pid传-1
	 *
	 * @param
	 * @return
	 * @title
	 * @tables
	 * @simple
	 * @author xiongfeixiang
	 * @date 2017/10/3 10:33
	 * @since v1.0.0
	 */
	private List<SmAreaVo> getChildAreaList(Long pid) throws Exception {
		SmAreaExample example = new SmAreaExample();
		SmAreaExample.Criteria c = example.createCriteria();
		// -1 查询所有
		if (pid.intValue() != -1) {
			c.andUpperAreaIdEqualTo(pid);
		} else {
			// 约定upper_area_id为0则是顶级节点
			c.andUpperAreaIdEqualTo(0L);
		}
		List<SmArea> child = smAreaMapper.selectByExample(example);
		return child.stream().map(smArea -> {
			SmAreaVo vo = new SmAreaVo();
			try {
				BeanUtils.copyProperties(vo, smArea);
				vo.setChild(getChildAreaList(smArea.getAreaId()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return vo;
		}).collect(Collectors.toList());

	}

	/**
	 * 递归获取区域树型id集合，获取所有，pid传-1
	 *
	 * @param pid
	 * @param result
	 * @return
	 */
	private List<Long> getAreaTreeIdList(Long pid, List<Long> result) {
		SmAreaExample example = new SmAreaExample();
		SmAreaExample.Criteria c = example.createCriteria();
		// 顶级节点
		if (pid.intValue() != -1) {
			c.andUpperAreaIdEqualTo(pid);
		} else {
			// 约定upper_area_id为0则是顶级节点
			c.andUpperAreaIdEqualTo(0L);
		}
		List<SmArea> child = smAreaMapper.selectByExample(example);
		child.forEach(smArea -> {
			result.add(smArea.getAreaId());
			result.addAll(getAreaTreeIdList(smArea.getAreaId(), result));
		});
		return result;

	}

	public List<SmArea> getAll() {
		SmAreaExample example = new SmAreaExample();
		SmAreaExample.Criteria c = example.createCriteria();
		return smAreaMapper.selectByExample(example);
	}

}
