package com.simpleway.frst.mapper;

import com.simpleway.frst.base.BaseMapper;
import com.simpleway.frst.domain.dto.SmConstValue;
import com.simpleway.frst.request.constinfo.ConstValueWhere;

import java.util.List;

public interface SmConstValueMapper extends BaseMapper<SmConstValue> {

    /**
     * 分页查询静态类型
     *
     * @param where
     * @return
     */
    List<SmConstValue> pageConstValue(ConstValueWhere where);

    /**
     * @param
     * @return void
     * @throws
     * @Description: 根据类型id删除静态值
     */
    void deleteConstValueByTypeId(Long constTypeId);
}