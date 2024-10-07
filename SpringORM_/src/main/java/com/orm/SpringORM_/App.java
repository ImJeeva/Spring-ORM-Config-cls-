package com.orm.SpringORM_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.DAOFile.Insert;
import com.spring.config.AppConfig;
import com.spring.entity.Student;

public class App {
  public static void main(String[] args) {
	  AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	  Student s = (Student) ac.getBean("student");
	  Insert insert = (Insert) ac.getBean("insert");
	  insert.insertStudent(s);

  }
}
