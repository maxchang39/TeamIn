package edu.neu.maxchang39.teamin.model;

public class Id implements Comparable<Id> {
	private Integer number;
	
	/*
	 * Generates a random uuid 
	 */
	public Id() {
		this.number = 1;
	}

	public Id(Integer id) {
		this.number = id;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Id))
			return false;
		Id v = (Id) o;
		return v.number.equals(number);
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return number.toString();
	}
	
	public int compareTo(Id id) {
		return this.number.compareTo(id.number);
	}
}
