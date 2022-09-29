package com.collection.bll;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;

public class Languages001 {

	public static void main(String[]  args) {
		
		LinkedList<String> lang = new LinkedList<String>();
		
		lang.add("C");
		lang.add("C++");
		lang.add("Java");
		lang.add("Kotlin");
		lang.add("Python");
		lang.add("Perl");
		lang.add("Ruby");
		
    System.out.println("** Display all the element **");

		System.out.println("Languages : "+lang);
				
        //Display all elements of the list
		
		     /*	
				for(String languages :lang) {
					System.out.println(lang);
				}
			 */	
	
				//Remove index 5
		// System.out.println(lang.remove(5));

				lang.remove(5);
				System.out.println("**************************");
				System.out.println("Display all the elements after removing the index 5");
				for(String language :lang)
					System.out.println("Language : "+language);
			
		
				//Remove kotlin element
				lang.remove("Kotlin");
				System.out.println("************************");
				System.out.println("Display all elemens after remove kotlin element :");
				for(String language :lang)
					System.out.println("Language : "+language);
				
            
				//Remove all the scripting languages (Python, Ruby, Perl)
				LinkedList<String> scripting_languages = new LinkedList<> (Arrays.asList("Python","Rubi","Perl"));
				
				System.out.println(lang.removeAll(scripting_languages));
				
				System.out.println("************************************************");
				System.out.println("Display all elemens after remove all "
								+ "the scripting languages (Python, Ruby, Perl) :");
				for(String language :lang)
					System.out.println("Language : "+language);
				
				//Remove all elements
				lang.removeAll(lang);
				System.out.println("************************************************");
				System.out.println("List after the removing all the elements from list :");
				for(String language :lang)
					System.out.println(language);
				System.out.println("List : "+lang);
			}

		}


