package com.accor.wco.sample.vaultconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	  @Value("${data}")
	  private String comment;
	  public String getComment(){
		    return comment;
	  }
}
