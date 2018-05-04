package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.FinanceInfo;
import com.simpleway.frst.domain.dto.FinanceSupervisor;
import com.simpleway.frst.domain.dto.FinanceSupervisorExample;
import com.simpleway.frst.domain.vo.FinanceSupervisorVo;
import com.simpleway.frst.mapper.FinanceInfoMapper;
import com.simpleway.frst.mapper.FinanceSupervisorMapper;
import com.simpleway.frst.request.finance.FinanceSupervisorForm;
import com.simpleway.frst.request.finance.FinanceSupervisorQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title FinanceSupervisorService
 * @date 2017/9/28 17:17
 * @since v1.0.0
 */
@Service
public class FinanceSupervisorService {
    @Resource
    FinanceSupervisorMapper financeSupervisorMapper;

    @Resource
    FinanceInfoMapper financeInfoMapper;

    public Boolean addFianceSupervisor(FinanceSupervisorForm financeSupervisor) throws Exception {
        FinanceSupervisor supervisor = new FinanceSupervisor();
        BeanUtils.copyProperties(supervisor, financeSupervisor);
        supervisor.setId(SequenceUtil.getSeqId());
        int i = financeSupervisorMapper.insertSelective(supervisor);
        return i > 0;
    }

    public Boolean updFianceSupervisor(FinanceSupervisorForm financeSupervisor) throws Exception {
        FinanceSupervisor supervisor = new FinanceSupervisor();
        BeanUtils.copyProperties(supervisor, financeSupervisor);
        int i = financeSupervisorMapper.updateByPrimaryKeySelective(supervisor);
        return i > 0;
    }

    public Boolean delFianceSupervisor(Long id) throws Exception {
        int i = financeSupervisorMapper.deleteByPrimaryKey(id);
        return i > 0;
    }

    public Page getFinanceSupervisor(FinanceSupervisorQuery query) throws Exception {
        Page<FinanceSupervisor> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        FinanceSupervisorExample example = new FinanceSupervisorExample();
        example.setOrderByClause("update_time desc");
        FinanceSupervisorExample.Criteria c = example.createCriteria();
        if (query.getFinanceId() != null) {
            c.andFinanceIdEqualTo(query.getFinanceId());
        }
        if (StringUtils.isNotBlank(query.getSupervisorName())) {
            c.andSupervisorNameLike("%" + query.getSupervisorName() + "%");
        }
        if (StringUtils.isNotBlank(query.getTelephone())) {
            c.andTelephoneLike("%" + query.getTelephone() + "%");
        }

        financeSupervisorMapper.selectByExample(example);
        Page<FinanceSupervisorVo> voPage = new Page<>();
        BeanUtils.copyProperties(voPage, page);
        voPage.setTotal(page.getTotal());
        for (FinanceSupervisor financeSupervisor : page) {
            FinanceSupervisorVo vo = new FinanceSupervisorVo();

            BeanUtils.copyProperties(vo, financeSupervisor);
            FinanceInfo financeInfo = financeInfoMapper.selectByPrimaryKey(financeSupervisor.getFinanceId());
            if (null != financeInfo && StringUtils.isNotBlank(financeInfo.getFinanceName())) {
                vo.setFinanceName(financeInfo.getFinanceName());
            }
            voPage.add(vo);
        }

        return voPage;
    }

    public FinanceSupervisor getFianceSupervisorDetail(Long id) {
        FinanceSupervisor info = financeSupervisorMapper.selectByPrimaryKey(id);
        if (null == info) {
            throw new RuntimeException("根据id：" + id + "查询出的金融办监管人员信息为空");
        }
        return info;
    }
}
