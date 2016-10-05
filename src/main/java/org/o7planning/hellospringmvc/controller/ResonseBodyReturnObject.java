package org.o7planning.hellospringmvc.controller;

import org.o7planning.hellospringmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResonseBodyReturnObject {
	@RequestMapping(value="/getStudentInfo")
	public @ResponseBody Student getStudentInfo(@RequestParam(value = "studentID", defaultValue = "empty") String studentID) {
		if(studentID!=null && studentID.equals("1payStaff")) {
			Student s = new Student();
			s.setId(studentID);
			s.setName("Tuan Anh");
			s.setAddress("Yen Lang, Dong Da, Ha Noi");
			return s;
		}
		return new Student();
	}
	
}
