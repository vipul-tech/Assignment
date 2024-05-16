package com.map;

public class Product implements Comparable<Product>{
	private int prodId;
	private String prodName;
	public Product() {
		super();
	}
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	@Override
	public int compareTo(Product o) {
		System.out.println("compare to method...");
		return this.prodId-o.getProdId();
	}
	@Override
	public int hashCode() {
		System.out.println("hash code...");
		final int prime = 31;
		int result = 1;
		result = prime * result + prodId;
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodId != other.prodId)
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		return true;
	}
}

