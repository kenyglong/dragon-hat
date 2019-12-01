package com.dragonhat.util.domain;

public class Combination {
	private long countInTheory;
	private long actualCount;
	private String result;
	public long getCountInTheory() {
		return countInTheory;
	}
	public void setCountInTheory(long countInTheory) {
		this.countInTheory = countInTheory;
	}
	public long getActualCount() {
		return actualCount;
	}
	public void setActualCount(long actualCount) {
		this.actualCount = actualCount;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (actualCount ^ (actualCount >>> 32));
		result = prime * result + (int) (countInTheory ^ (countInTheory >>> 32));
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Combination other = (Combination) obj;
		if (actualCount != other.actualCount)
			return false;
		if (countInTheory != other.countInTheory)
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}
	

}
