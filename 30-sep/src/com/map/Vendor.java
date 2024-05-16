package com.map;

import java.util.Objects;

public class Vendor implements Comparable<Vendor>{
	private int vendorId;
	private String vendorName;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(vendorId, vendorName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return vendorId == other.vendorId && Objects.equals(vendorName, other.vendorName);
	}
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(int vendorId, String vendorName) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
	}
	@Override
	public int compareTo(Vendor o) {
		
		return this.vendorId-o.getVendorId();
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + "]";
	}
	
	
}
