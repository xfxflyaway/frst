package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.FinanceInfo;
import com.simpleway.frst.domain.dto.FinanceInfoExample;
import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.domain.vo.FinanceInfoVo;
import com.simpleway.frst.mapper.FinanceInfoMapper;
import com.simpleway.frst.mapper.SmAreaMapper;
import com.simpleway.frst.request.finance.FinanceForm;
import com.simpleway.frst.request.finance.FinanceQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title FinanceService
 * @date 2017/9/28 13:56
 * @since v1.0.0
 */
@Service
public class FinanceService {
    @Resource
    private FinanceInfoMapper financeInfoMapper;

    @Resource
    private SmAreaMapper smAreaMapper;

    public Boolean addFiance(FinanceForm finance) throws Exception {
        FinanceInfo financeInfo = new FinanceInfo();
        BeanUtils.copyProperties(financeInfo, finance);
        financeInfo.setFinanceId(SequenceUtil.getSeqId());
        int i = financeInfoMapper.insertSelective(financeInfo);
        return i > 0;
    }

    public Boolean updFiance(FinanceForm finance) throws Exception {
        FinanceInfo financeInfo = new FinanceInfo();
        BeanUtils.copyProperties(financeInfo, finance);
        int i = financeInfoMapper.updateByPrimaryKeySelective(financeInfo);
        return i > 0;
    }

    public Boolean delFiance(Long id) throws Exception {
        int i = financeInfoMapper.deleteByPrimaryKey(id);
        return i > 0;
    }

    public Page getFinance(FinanceQuery query) throws Exception {
        Page<FinanceInfo> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        FinanceInfoExample example = new FinanceInfoExample();
        example.setOrderByClause("update_time desc");
        FinanceInfoExample.Criteria c = example.createCriteria();
        if (query.getAreaId() != null) {
            c.andAreaIdEqualTo(query.getAreaId());
        }
        if (StringUtils.isNotBlank(query.getFinanceName())) {
            c.andFinanceNameLike("%" + query.getFinanceName() + "%");
        }
        if (query.getFinanceType() != null) {
            c.andFinanceTypeEqualTo(query.getFinanceType());
        }
        if (StringUtils.isNotBlank(query.getRelaMan())) {
            c.andRelaManEqualTo(query.getRelaMan());
        }
        if (StringUtils.isNotBlank(query.getRelaMobile())) {
            c.andRelaManLike("%" + query.getRelaMobile() + "%");
        }
        if (query.getState() != null) {
            c.andStateEqualTo(query.getState());
        }
        financeInfoMapper.selectByExample(example);

        Page<FinanceInfoVo> voPage = new Page<>();
        BeanUtils.copyProperties(voPage, page);
        voPage.setTotal(page.getTotal());
        for (FinanceInfo financeInfo : page) {
            FinanceInfoVo vo = new FinanceInfoVo();
            BeanUtils.copyProperties(vo, financeInfo);
            if (financeInfo.getAreaId() != null) {
                SmArea area = smAreaMapper.selectByPrimaryKey(financeInfo.getAreaId());
                if (null != area && StringUtils.isNotBlank(area.getAreaName())) {
                    vo.setAreaName(area.getAreaName());
                }
            }
            voPage.add(vo);
        }
        return voPage;
    }

    public FinanceInfo getFianceDetail(Long id) {
        FinanceInfo info = financeInfoMapper.selectByPrimaryKey(id);
        if (null == info) {
            throw new RuntimeException("根据id：" + id + "查询出的金融办信息为空");
        }
        return info;
    }

    /**
     * 根据类型返回金融办信息
     *
     * @param type 1市   2区
     * @return
     */
    public List listByType(Integer type) {
        FinanceInfoExample example = new FinanceInfoExample();
        example.setOrderByClause("update_time desc");
        FinanceInfoExample.Criteria c = example.createCriteria();
        //金融办类型 1：市级  2：区级
        c.andFinanceTypeEqualTo(type);
        return financeInfoMapper.selectByExample(example);
    }
}
