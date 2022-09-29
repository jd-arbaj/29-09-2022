package com.collection.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList001 {

    public static void main(String[] args) {
    	
    	ArrayList<Student001> students = new ArrayList<>();
		
		Student001 std1 = new Student001("AF0216223","Aryan Raj",21,"Andra Pradhesh");
		Student001 std2 = new Student001("AF0216224","Bivor Kumar",22,"Andra Pradhesh");
		Student001 std3 = new Student001("AF0216227","SUSHMITA KUMARI",23,"Madhya Pradesh");
		Student001 std4 = new Student001("AF0216231","Ragiv Zafar",24,"Maharashtra");
		Student001 std5 = new Student001("AF0216232","RAHUL MAHTO",25,"Orissa");
		Student001 std6 = new Student001("AF0216234","Nainsi Kumari",19,"Gujarath");
		Student001 std7 = new Student001("AF0216236","MD ALI",26,"Madhya Pradesh");
		Student001 std8 = new Student001("AF0216238","ABHISHEK KUMAR",22,"Andra Pradhesh");
		Student001 std9 = new Student001("AF0216240","AFROZ ANSARI",21,"Maharashtra");
		Student001 std10 = new Student001("AF0216259","RITIK RAJ",20,"Orissa");
		Student001 std11 = new Student001("AF0216263","Anant Kumar",25,"Andra Pradhesh");
		Student001 std12 = new Student001("AF0216305","BABU KUMAR",24,"Gujarath");
		Student001 std13 = new Student001("AF0216307","NIKITA KUMARI",23,"Madhya Pradesh");
		Student001 std14 = new Student001("AF0216353","PRANAV PANDEY",22,"Orissa");
		Student001 std15 = new Student001("AF0216964","Radheshyam Kumar",21,"Maharashtra");
		Student001 std16 = new Student001("AF0216973","Ankur Utpal",19,"Gujarath");
		Student001 std17 = new Student001("AF0217607","Banty Mishra",18,"Madhya Pradesh");
		Student001 std18 = new Student001("AF0217615","RIYA KUMARI",20,"Madhya Pradesh");
		Student001 std19 = new Student001("AF0217791","Priyadarshani Kumari",21,"Maharashtra");
		Student001 std20 = new Student001("AF0223373","Chanchal Thakur",22,"Orissa");
		Student001 std21 = new Student001("AF0221549","Satendra Kumar",23,"Maharastra");
		Student001 std22 = new Student001("AF0216212","Pappi Verma",24,"Khategaon");
		Student001 std23 = new Student001("AF0216244","RamKrishn Kushwaha",25,"Andra Pradesh");
		Student001 std24 = new Student001("AF0223373","Yogita Tamolia",26,"Orissa");
				
		

		
		Collections.addAll(students, std1,std2,std3,std4,std5,std6,std7,std8,std9,std10,
							std11,std12,std13,std14,std15,std16,std17,std18,std19,std20,std21,std22,std23,std24);
		
		System.out.println("Total Students : "+students.size());
		for(Object s: students){
			System.out.println(s);
		}
		System.out.println("**************************************************************"
				+"\n**************************************************************");
		
		System.out.println("List of Students above 20 years : ");
		//Display students aged over 20
		for(Student001 s: students) {
			if(s.getAge()>20)
			System.out.println(s);
		}
		System.out.println("**************************************************************"
				+"\n**************************************************************");
	
		System.out.println("List of Students of Andhra Pradhesh : ");
		//Search students from the state Andhra Pradhesh
		for(Student001 s: students)
		{
			if(s.getState()=="Andra Pradhesh")
				System.out.println(s);
		}

		//Sort students by their age.
		Collections.sort(students);  
		
		System.out.println("**************************************************************"
						+"\n**************************************************************");
		System.out.println("Sorted students by their age ascending order : ");
		
		
		
		//Traversing list through Iterator
		Iterator<Student001> itr=students.iterator();
		int i=0;
		while(itr.hasNext()){  
			System.out.println(++i +". "+itr.next());  
		}
	}
}



