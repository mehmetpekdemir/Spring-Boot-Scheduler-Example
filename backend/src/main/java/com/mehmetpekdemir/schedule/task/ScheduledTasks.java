package com.mehmetpekdemir.schedule.task;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Component
public class ScheduledTasks {

	private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);

	@Scheduled(fixedRate = 2000)
	public void scheduleTaskWithFixedRate() {
		LOG.info("Fixed rate task = " + new Date());
	}

	@Scheduled(fixedDelay = 3000)
	public void scheduleTaskWithFixedDelay() {
		LOG.info("Fixed delay task = " + new Date());
	}

	@Scheduled(fixedRate = 2000, initialDelay = 5000)
	public void scheduleTaskWithInitialDelay() {
		LOG.info("Fixed rate Task with initial delay = " + new Date());

	}

	/**
	 * <p>
	 * miniute, hour, day(month), month, day(week)
	 * </p>
	 */
	@Scheduled(cron = "*/7 * * * * ?")
	public void scheduleTaskWithCronExpression() {
		LOG.info("Method executed at every 7 seconds. Current time is = " + new Date());
	}

}
