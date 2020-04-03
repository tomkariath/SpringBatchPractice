package websystique.processor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class EmployeeJobListener implements JobExecutionListener{

	LocalDateTime startTime, stopTime;
	
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		startTime = LocalDateTime.now();
		System.out.println("Start Time: "+ startTime);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		stopTime = LocalDateTime.now();
		System.out.println("End Time: "+ stopTime);
		System.out.println("Time taken: "+ Duration.between(stopTime, startTime));
		
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			System.out.println("Job Completed successfully");
		}
		else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			System.out.println("Job Failed with following error:");
			List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
			
			for (Throwable exception : exceptionList) {
				System.err.println(exception.getLocalizedMessage());
			}
		}
	}	
}
