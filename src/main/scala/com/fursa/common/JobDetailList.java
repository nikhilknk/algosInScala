/**
 * 
 */
package com.fursa.common;

import java.util.List;

/**
 * @author nkakkireni
 *
 */
public class JobDetailList {
	public JobDetailList(int totalProfit, List<Job> jobList) {
		super();
		this.totalProfit = totalProfit;
		this.jobList = jobList;
	}
	private int totalProfit;
	private List<Job> jobList;
	public JobDetailList() {
		super();
	}
	/**
	 * @return the totalProfit
	 */
	public int getTotalProfit() {
		return totalProfit;
	}
	/**
	 * @param totalProfit the totalProfit to set
	 */
	public void setTotalProfit(int totalProfit) {
		this.totalProfit = totalProfit;
	}
	/**
	 * @return the jobList
	 */
	public List<Job> getJobList() {
		return jobList;
	}
	/**
	 * @param jobList the jobList to set
	 */
	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}
}
