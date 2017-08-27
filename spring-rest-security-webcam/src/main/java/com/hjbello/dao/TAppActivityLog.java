package com.hjbello.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "app_activity_log")
public class TAppActivityLog {
	@Id
	@Column(name="username")
 	private String username;
	
	@Column(name="user_ip")
	private String userIp;
	
	@Column(name="photos_sent")
	private String photosSent;
	
	@Column(name="date_accessed")
	private Date dateAccessed;
	
	public TAppActivityLog(String username, String userIp, String photosSent, Date dateAccessed) {
		super();
		this.username = username;
		this.userIp = userIp;
		this.photosSent = photosSent;
		this.dateAccessed = dateAccessed;
	}
	public TAppActivityLog() {
		super();
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
	public String getPhotosSent() {
		return photosSent;
	}
	public void setPhotosSent(String photosSent) {
		this.photosSent = photosSent;
	}
	public Date getDateAccessed() {
		return dateAccessed;
	}
	public void setDateAccessed(Date dateAccessed) {
		this.dateAccessed = dateAccessed;
	}

}
