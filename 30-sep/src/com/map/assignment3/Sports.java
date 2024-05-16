package com.map.assignment3;

import java.util.Objects;

public class Sports implements Comparable<Sports>{
	private int id;
	private String sportsName;
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sports(int id, String sportsName) {
		super();
		this.id = id;
		this.sportsName = sportsName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	@Override
	public String toString() {
		return "Sports [id=" + id + ", sportsName=" + sportsName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, sportsName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sports other = (Sports) obj;
		return id == other.id && Objects.equals(sportsName, other.sportsName);
	}
	@Override
	public int compareTo(Sports o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}
	
}
