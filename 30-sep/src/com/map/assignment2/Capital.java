package com.map.assignment2;

import java.util.Objects;

public class Capital implements Comparable<Capital>{
	private int id;
	private String city;
	public Capital(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public Capital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Capital [id=" + id + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capital other = (Capital) obj;
		return Objects.equals(city, other.city) && id == other.id;
	}
	@Override
	public int compareTo(Capital o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}
	
}
