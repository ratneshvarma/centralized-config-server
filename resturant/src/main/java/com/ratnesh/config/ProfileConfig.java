package com.ratnesh.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ProfileConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${resturant.title}")
	private String resturantTitle;

	@Value("${resturant.address}")
	private String resturantAddress;

	@Value("${resturant.staff}")
	private Integer resturantStaff;

	public String getResturantTitle() {
		return resturantTitle;
	}

	public void setResturantTitle(String resturantTitle) {
		this.resturantTitle = resturantTitle;
	}

	public String getResturantAddress() {
		return resturantAddress;
	}

	public void setResturantAddress(String resturantAddress) {
		this.resturantAddress = resturantAddress;
	}

	public Integer getResturantStaff() {
		return resturantStaff;
	}

	public void setResturantStaff(Integer resturantStaff) {
		this.resturantStaff = resturantStaff;
	}

}
