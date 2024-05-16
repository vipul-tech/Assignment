package com.map.assignment3;

import java.util.Objects;

public class Legends implements Comparable<Legends>{
	private int id;
	private String playerName;
	public Legends() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Legends(int id, String playerName) {
		super();
		this.id = id;
		this.playerName = playerName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "Legends [id=" + id + ", playerName=" + playerName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, playerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Legends other = (Legends) obj;
		return id == other.id && Objects.equals(playerName, other.playerName);
	}
	@Override
	public int compareTo(Legends o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}
	
}
