package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.domain.dto.SmConstType;
import com.simpleway.frst.domain.dto.SmConstValue;
import com.simpleway.frst.mapper.SmConstTypeMapper;
import com.simpleway.frst.mapper.SmConstValueMapper;
import com.simpleway.frst.request.constinfo.ConstTypeWhere;
import com.simpleway.frst.request.constinfo.ConstValueWhere;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.util.ReflectUtils;
import com.simpleway.frst.util.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ConstService {

    public static final String CONSTMODULE = "静态值模块";
    @Autowired
    private SmConstTypeMapper constTypeMapper;
    @Autowired
    private SmConstValueMapper constValueMapper;

    public void addConstType(SmConstType smConstType) {
        smConstType.setConstTypeId(SequenceUtil.getSeqId());
        constTypeMapper.insert(smConstType);


    }

    public void deleteConstType(Long constTypeId) {
        SmConstType smConstType = new SmConstType();
        smConstType.setConstTypeId(constTypeId);
        constTypeMapper.delete(smConstType);


    }

    public void updateConstType(SmConstType smConstType) {
        constTypeMapper.updateByPrimaryKey(smConstType);


    }

    public List<SmConstType> findConstType() {
        return constTypeMapper.selectAll();
    }

    public void addConstValue(SmConstValue smConstValue) {
        smConstValue.setId(SequenceUtil.getSeqId());
        constValueMapper.insert(smConstValue);

    }

    public void deleteConstValue(Long constValueId) {
        SmConstValue smConstValue = new SmConstValue();
        smConstValue.setId(constValueId);
        constValueMapper.delete(smConstValue);


    }

    public void updateConstValue(SmConstValue smConstValue) {
        constValueMapper.updateByPrimaryKey(smConstValue);


    }

    public List<SmConstValue> findConstValueByTypeId(Long constTypeId) {
        Example e = new Example(SmConstValue.class);
        e.setOrderByClause("sort desc");
        e.createCriteria().andEqualTo("constTypeId",constTypeId);
        return constValueMapper.selectByExample(e);
    }

    public JsonPage<SmConstType> pageConstType(Map<String, String> params) {
        ConstTypeWhere where = ReflectUtils.getWhereBean(params, ConstTypeWhere.class);
        Page<SmConstType> page = PageHelper.startPage(where.getPageNo(), where.getPageSize());
        constTypeMapper.pageConstType(where);
        return new JsonPage<>(page);
    }

    public JsonPage<SmConstValue> pageConstValue(Map<String, String> params) {
        ConstValueWhere where = ReflectUtils.getWhereBean(params, ConstValueWhere.class);
        Page<SmConstValue> page = PageHelper.startPage(where.getPageNo(), where.getPageSize());
        constValueMapper.pageConstValue(where);
        return new JsonPage<>(page);
    }

    public SmConstType getConstType(Long constTypeId) {
        SmConstType smConstType = new SmConstType();
        smConstType.setConstTypeId(constTypeId);
        return constTypeMapper.selectOne(smConstType);
    }

    public SmConstValue getConstValue(Long constValueId) {
        SmConstValue smConstValue = new SmConstValue();
        smConstValue.setId(constValueId);
        return constValueMapper.selectOne(smConstValue);
    }

    public void deleteConstValueByTypeId(Long constTypeId) {
        constValueMapper.deleteConstValueByTypeId(constTypeId);
    }

    public List<SmConstValue> getConstValuesByCode(String code) {
        SmConstType constType = new SmConstType();
        constType.setConstTypeCode(code);
        SmConstType ctype = constTypeMapper.selectOne(constType);
        Long typeId = ctype.getConstTypeId();
        return this.findConstValueByTypeId(typeId);
    }
}
