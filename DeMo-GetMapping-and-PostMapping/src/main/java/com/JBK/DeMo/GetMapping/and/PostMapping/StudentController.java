package com.JBK.DeMo.GetMapping.and.PostMapping;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@RequestMapping("ss")
	String getData() {
		return "Gopal";
	}
	
	ArrayList<Student> aa=new ArrayList<>();

	public StudentController() {
		aa.add(new Student(101, "Gopal"));
		aa.add(new Student(102, "Raja"));
		aa.add(new Student(103, "AWS"));
		aa.add(new Student(104, "SAleforce"));
	}

	// Multiple Record's
	@GetMapping("alllllllll")
	public ArrayList<Student> multipleRecordShow() {
		return aa;
	}

	// Single Record
	@GetMapping("alllllllll/{id}")  //alllllllll/101
	public Student singleRecordShow(@PathVariable int id) {
		Student ss= new Student();
		for (Student student : aa) {
			if (student.id==id) {
				ss=student;
			}
		}
		return ss;
	}

	@PostMapping("insertRecord")
	public ArrayList<Student> insertRecord(@RequestBody Student student) {
		aa.add(student);
		return aa;
	}

}
