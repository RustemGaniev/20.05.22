package ru.netology.servlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.config.JavaConfig;
import ru.netology.controller.PostController;


import javax.servlet.http.HttpServlet;


public class MainServlet extends HttpServlet {
  private PostController controller;

  @Override
  public void init() {
    final var applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
    controller = applicationContext.getBean(PostController.class);
  }

}

