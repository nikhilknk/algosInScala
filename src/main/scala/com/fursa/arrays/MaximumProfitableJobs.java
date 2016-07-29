/**
 * 
 */
package com.fursa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fursa.common.Job;
import com.fursa.common.JobDetailList;

/**
 * @author nkakkireni
 *
 */
public class MaximumProfitableJobs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Job job1 = new Job(3, 5, 20);
		Job job2 = new Job(1, 2, 50);
		Job job3 = new Job(6, 19, 100);
		Job job4 = new Job(2, 100, 200);

		Job jobArray[] = new Job[4];

		jobArray[0] = job1;
		jobArray[1] = job2;
		jobArray[2] = job3;
		jobArray[3] = job4;

		JobDetailList jobList = getmaximumProfit(jobArray);
		System.out.println("total profit::"+jobList.getTotalProfit());
		System.out.println("output list :::"+Arrays.toString(jobList.getJobList().toArray()));

	}

	private static JobDetailList getmaximumProfit(Job[] jobArray) {
		Arrays.sort(jobArray);
		Map<Integer,JobDetailList> result = new java.util.HashMap<Integer,JobDetailList>();
		JobDetailList jobDetail = new JobDetailList();
		List<Job> jobList = new ArrayList<Job>();
		jobList.add(jobArray[0]);
		jobDetail.setJobList(jobList);
		jobDetail.setTotalProfit(jobArray[0].getProfit());
		result.put(0, jobDetail);

		for(int i =1;i<jobArray.length;i++){
			int inclusiveProfit = jobArray[i].getProfit();
			int position = getLatestNonConflict(jobArray,i);
			if(position != -1){
				inclusiveProfit += result.get(position).getTotalProfit();
			}

			if(inclusiveProfit > result.get(i-1).getTotalProfit()){
				List<Job> jobs = new ArrayList<Job>();
				jobs.addAll(result.get(position).getJobList());
				jobs.add(jobArray[i]);
				result.put(i, new JobDetailList(inclusiveProfit,jobs));
			}else{
				result.put(i, result.get(i-1));
			}

		}
		System.out.println(Arrays.toString(jobArray));
		return result.get(jobArray.length-1);
	}

	private static int getLatestNonConflict(Job[] jobArray, int i) {

		int low=0;int high =i-1;
		while(low<=high){
			int mid = low+high/2;
			if(jobArray[mid].getEndTime()<=jobArray[i].getStartTime()){
				if(jobArray[mid+1].getEndTime()<=jobArray[i].getStartTime()){
					low = mid + 1;}
				else
					return mid;
			}else{
				high = mid-1;
			}
		}
		return -1;
	}

}
