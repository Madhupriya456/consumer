package com.spring.consumer.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

   public class Consumer
   {
	   private String id;
	   private String message;
	   private Date messageDate;
	
      
	   public String getId() {
		return id;
	}
	   public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	@Override
	public String toString()
	{
		return "message: "+message;
	}
	  
   }

