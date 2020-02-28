/**
 * 
 */
package com.spring.boot.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Rajesh Sadh
 *
 */
@Component
public class Consumer {
	
	@JmsListener(destination="inmemory.queue")
	public void listener(String message) {
		System.out.println("Received message :"+message);
	}
}
