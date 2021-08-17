package com.spring.consumer.configuration;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.spring.consumer.beans.Consumer;

@Component
public class MessageListener {

	@RabbitListener(queues = ConsumerConfig.QUEUE)
	public void listener(Consumer consumer)
	{
		System.out.println(consumer);
	}
}
