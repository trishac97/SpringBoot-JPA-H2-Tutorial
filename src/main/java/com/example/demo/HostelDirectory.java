package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HostelDirectory {
	
	@Id
	private int roomNo;
	private int sid;
	private String sName;
	private String sCity;
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	@Override
	public String toString() {
		return "HostelDirectory [roomNo=" + roomNo + ", sid=" + sid + ", sName=" + sName + ", sCity=" + sCity + "]";
	}
	
	
}
