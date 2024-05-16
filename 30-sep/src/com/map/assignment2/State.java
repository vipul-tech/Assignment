package com.map.assignment2;

import java.util.Objects;

public class State implements Comparable<State>{
	private String name;
	private int stateId;

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(int stateId, String name) {
		super();
		this.name = name;
		this.stateId=stateId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "State [name=" + name + ", stateId=" + stateId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, stateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(name, other.name) && stateId == other.stateId;
	}

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
		return this.stateId-o.getStateId();
	}
	
}
