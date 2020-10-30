package com.mehmetpekdemir.schedule.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "spring.enable.scheduling")
public class ScheduleEnabling {

}
