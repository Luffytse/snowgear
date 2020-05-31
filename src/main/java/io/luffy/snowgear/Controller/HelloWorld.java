package io.luffy.snowgear.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @ResponseBody
  @RequestMapping(path = "/hello")
  public String hello(){
    return "Hello, this is snowgear server. Happy developing/skiiing/snowboarding.";
  }
}
