/**
 * 
 */
package com.fursa.common;


/**
 * @author nkakkireni
 *
 */
public class Job implements Comparable<Job>{
	private int startTime;
	private int endTime;
	private int profit;
	/**
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Job [startTime=" + startTime + ", endTime=" + endTime
				+ ", profit=" + profit + "]";
	}
	public Job(int startTime, int endTime, int profit) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.profit = profit;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the profit
	 */
	public int getProfit() {
		return profit;
	}
	/**
	 * @param profit the profit to set
	 */
	public void setProfit(int profit) {
		this.profit = profit;
	}
	/***
	 * 
	 */
	public int compareTo(Job job) {
		return this.endTime-job.endTime;
	}
}
