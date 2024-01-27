package oit.is.z1976.fgo.fgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping("/mainroom")
  public String mainroom() {
    return "mainroom.html";
  }
}
