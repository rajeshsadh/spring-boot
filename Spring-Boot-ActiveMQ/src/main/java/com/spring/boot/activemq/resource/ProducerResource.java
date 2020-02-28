/**
 * 
 */
package com.spring.boot.activemq.resource;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rajesh Sadh
 *
 */
@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@GetMapping("/{message}")
	public ResponseEntity<String> publish(@PathVariable("message") final String message) {
		try {
			jmsTemplate.convertAndSend(queue, message);
			return new ResponseEntity<String>("Published Successfully...", HttpStatus.OK);
		}catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Message not published!!!", HttpStatus.FAILED_DEPENDENCY);
		}
	}
	
	@GetMapping("/")
	public String publish() {
		//jmsTemplate.convertAndSend(queue, "Please pass the message like http://localhost:2020/rest/publish/message here");
		return "Please pass the message like http://localhost:2020/rest/publish/message here";
	}
}
