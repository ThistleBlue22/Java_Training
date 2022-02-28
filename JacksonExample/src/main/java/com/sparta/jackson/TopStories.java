package com.sparta.jackson;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TopStories {

	@JsonProperty("userTier")
	private String userTier;

	@JsonProperty("total")
	private int total;

	@JsonProperty("startIndex")
	private int startIndex;

	@JsonProperty("pages")
	private int pages;

	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("orderBy")
	private String orderBy;

	@JsonProperty("currentPage")
	private int currentPage;

	@JsonProperty("results")
	private List<NewsItem> results;

	@JsonProperty("status")
	private String status;

	public void setUserTier(String userTier){
		this.userTier = userTier;
	}

	public String getUserTier(){
		return userTier;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setStartIndex(int startIndex){
		this.startIndex = startIndex;
	}

	public int getStartIndex(){
		return startIndex;
	}

	public void setPages(int pages){
		this.pages = pages;
	}

	public int getPages(){
		return pages;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	public String getOrderBy(){
		return orderBy;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public void setResults(List<NewsItem> results){
		this.results = results;
	}

	public List<NewsItem> getResults(){
		return results;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}