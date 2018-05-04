package com.simpleway.frst.response;

import com.github.pagehelper.Page;

import java.util.List;

public class JsonPage<T> {

    private List<T> rows;

    private int pageNo;

    private int total;

    private Long records;

    public JsonPage() {
    }

    /**
     * 通过Page生成JsonPage
     *
     * @param page
     */
    public JsonPage(Page<T> page) {
        this.rows = page.getResult();
        this.pageNo = page.getPageNum();
        this.total = page.getPages();
        this.records = page.getTotal();
    }

    /**
     * 通过List生成JsonPage
     *
     * @param rows
     * @param page
     * @param total
     * @param records
     */
    public JsonPage(List<T> rows, int pageNo, int total, Long records) {
        this.rows = rows;
        this.pageNo = pageNo;
        this.total = total;
        this.records = records;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }

}
