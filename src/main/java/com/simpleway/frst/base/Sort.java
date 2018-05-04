package com.simpleway.frst.base;

/**
 * 排序类
 * @author xiongfeixiang
 * @since TODO 从哪个项目版本开始创建
 * @Date 2017年2月14日 下午3:53:34
 */
public class Sort {

    private String field;// 列名

    private String order;// 排序方式 desc|asc

    public Sort() {}

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Sort(String field, String order) {
        super();
        this.field = field;
        this.order = order;
    }


}
