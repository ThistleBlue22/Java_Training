package com.sparta.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guardian{

	@JsonProperty("response")
	private TopStories response;

	public void setResponse(TopStories response){
		this.response = response;
	}

	public TopStories getResponse(){
		return response;
	}
}