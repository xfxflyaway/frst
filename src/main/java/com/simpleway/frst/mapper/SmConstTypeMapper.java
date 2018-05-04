package com.simpleway.frst.mapper;

import com.simpleway.frst.base.BaseMapper;
import com.simpleway.frst.domain.dto.SmConstType;
import com.simpleway.frst.request.constinfo.ConstTypeWhere;

import java.util.List;

public interface SmConstTypeMapper extends BaseMapper<SmConstType> {

    /**
     * 分页查询静态类型
     *
     * @param where
     * @return
     */
    public List<SmConstType> pageConstType(ConstTypeWhere where);


}