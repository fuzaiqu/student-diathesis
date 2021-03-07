package com.dw.dao;





import java.util.List;

import com.dw.model.Student;

public interface StudentDao {
	
	
	
	
	
	public Student findStudentByid(int id);
		

	
	
	
	public boolean addStudent(Student stu);

	
	
	
	public boolean delStudent(int id);

	
	
	
	public boolean updateStudent(Student stu);

	
	
	
	@SuppressWarnings("unchecked")
	public List StSelect();
	
	
	
	 public Student findStudentById(String id); 

}
