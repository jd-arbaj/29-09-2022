package com.collection.bll;

public class Student001 implements Comparable<Student001> {

	    public String studentCode;
		public String studentName;
		public int age;
		public String state;
		
		  public Student001() {
			
		}
		  public Student001 (String studentCode,String studentName,int age,String state) {
			this.studentCode= studentCode;
			this.studentName= studentName;
			this.age= age;
			this.state=state;
		}
		
	 
		public String getStudentCode() {
			return studentCode;
		}
		public void setStudentCode(String studentCode) {
			this.studentCode = studentCode;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		public int compareTo(Student001 student) 
		{
			if(age==student.age) {
				return 0;
			}
			else if (age>student.age) {
				return 1;
			}
			else {
				return -1;
			}
		}
		@Override
		public String toString() {
			return "Student :[Code-"+studentCode+", Name-"+studentName+", Age-"
							+age+", State-"+state+"]";
			
		}
	}


