package com.cp.scheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job{

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("Hello My Job");
		
	}
	
	

}
