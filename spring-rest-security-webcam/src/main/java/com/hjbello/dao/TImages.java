package com.hjbello.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "images")
public class TImages {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int imageId;
	
	@Column(name="filename")
	private String filename;
	
	@Column(name="date_recorded")
	private Date dateRecorded;
	
	@Column(name="username")
	private String username;
	
	@Column(name="user_ip")
	private String userIp;
	
	public TImages() {
		super();
	}

	public TImages(String filename, Date dateRecorded, String username, String userIp) {
		super();
		this.filename = filename;
		this.dateRecorded = dateRecorded;
		this.username = username;
		this.userIp = userIp;
	}

	public int getImageId() {
		return imageId;
	}


	public void setImageId(int imageId) {
		this.imageId = imageId;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public Date getDateRecorded() {
		return dateRecorded;
	}


	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserIp() {
		return userIp;
	}


	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	

}
