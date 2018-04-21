package com.fendo.util;

import java.util.List;
/**
 * 分页器
 * @author 唯道
 *
 * @param <T>
 */
public class PageBean<T> {

	private List<T> dataModel;   
	private int totalPage;    //总页数
	private int currentPage;	//当前页
	private int pageSize;	//每页显示多少条
	
	
	public PageBean(List<T> dataModel, int totalPage, int currentPage, int pageSize) {
		super();
		this.dataModel = dataModel;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	public List<T> getDataModel() {
		return dataModel;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	

}
