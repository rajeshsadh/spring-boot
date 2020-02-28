/**
 * 
 */
package com.spring.boot.activemq.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author Rajesh Sadh
 *
 */
@EnableJms
@Configuration
public class JmsConfiguration {

	@Bean
	public Queue queue () {
		return new ActiveMQQueue("inmemory.queue");
	}
}
