package com.hnkjxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringcloudConfigClientApplication {

  @Value("${clientParam}")
  private String clientParam;
  @RequestMapping("/clientParam")
  public String getParam(){     return this.clientParam;  }

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudConfigClientApplication.class, args);
  }

}
