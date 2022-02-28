package com.sparta.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsItem {

	@JsonProperty("sectionName")
	private String sectionName;

	@JsonProperty("pillarName")
	private String pillarName;

	@JsonProperty("webPublicationDate")
	private String webPublicationDate;

	@JsonProperty("apiUrl")
	private String apiUrl;

	@JsonProperty("webUrl")
	private String webUrl;

	@JsonProperty("isHosted")
	private boolean isHosted;

	@JsonProperty("pillarId")
	private String pillarId;

	@JsonProperty("webTitle")
	private String webTitle;

	@JsonProperty("id")
	private String id;

	@JsonProperty("sectionId")
	private String sectionId;

	@JsonProperty("type")
	private String type;

	public void setSectionName(String sectionName){
		this.sectionName = sectionName;
	}

	public String getSectionName(){
		return sectionName;
	}

	public void setPillarName(String pillarName){
		this.pillarName = pillarName;
	}

	public String getPillarName(){
		return pillarName;
	}

	public void setWebPublicationDate(String webPublicationDate){
		this.webPublicationDate = webPublicationDate;
	}

	public String getWebPublicationDate(){
		return webPublicationDate;
	}

	public void setApiUrl(String apiUrl){
		this.apiUrl = apiUrl;
	}

	public String getApiUrl(){
		return apiUrl;
	}

	public void setWebUrl(String webUrl){
		this.webUrl = webUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public void setIsHosted(boolean isHosted){
		this.isHosted = isHosted;
	}

	public boolean isIsHosted(){
		return isHosted;
	}

	public void setPillarId(String pillarId){
		this.pillarId = pillarId;
	}

	public String getPillarId(){
		return pillarId;
	}

	public void setWebTitle(String webTitle){
		this.webTitle = webTitle;
	}

	public String getWebTitle(){
		return webTitle;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSectionId(String sectionId){
		this.sectionId = sectionId;
	}

	public String getSectionId(){
		return sectionId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}