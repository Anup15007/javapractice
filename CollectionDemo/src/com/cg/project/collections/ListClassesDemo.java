package com.cg.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListClassesDemo {
	public static void arrayListClassDemo()
	{
		ArrayList <String> strList=new ArrayList<>();
		//insert
		strList.add("Satish");
		strList.add("Kumar");
		strList.add("Nilesh");
		strList.add("Rakesh");
		strList.add("Ayush");
		strList.add("Satish");
		strList.add("Mayur");
		System.out.println(strList);
		//search
		String nameToBeSearch="Ayush";
		System.out.println(strList.contains(nameToBeSearch));
		
		ArrayList<Associate>associates=new ArrayList<Associate>();
		associates.add(new Associate(100,"Anup","Banerjee",12000));
		associates.add(new Associate(101,"Ashik","Rahman",12000));
		associates.add(new Associate(102,"Anirban","Barat",12000));
		associates.add(new Associate(103,"Neha","Sharma",12000));
		associates.add(new Associate(104,"Kuldeep","Dangwal",12000));
		
		Collections.sort(associates);
		for(Associate associate :associates) {
			System.out.println(associate);
		}	
			System.out.println("------------------------------------");
			Collections.sort(associates,new AssociateComparator());                       
			
			for(Associate associate :associates) {
				System.out.println(associate);
		}
	}
	public static void LinkedListClassDemo()
	{
		LinkedList<String> strList=new LinkedList<>();
		//insert
		strList.add("Satish");
		strList.add("Kumar");
		strList.add("Nilesh");
		strList.add("Rakesh");
		strList.add("Ayush");
		strList.add("Satish");
		strList.add("Mayur");
		System.out.println(strList);
		//search
		String nameToBeSearch="Ayush";
		System.out.println(strList.contains(nameToBeSearch));
		
		LinkedList<Associate>associates=new LinkedList<Associate>();
		associates.add(new Associate(100,"Anup","Banerjee",12000));
		associates.add(new Associate(101,"Ashik","Rahman",12000));
		associates.add(new Associate(102,"Anirban","Barat",12000));
		associates.add(new Associate(103,"Neha","Sharma",12000));
		associates.add(new Associate(104,"Kuldeep","Dangwal",12000));
		
		Collections.sort(associates);
		for(Associate associate :associates) {
			System.out.println(associate);
		}	
			System.out.println("------------------------------------");
			Collections.sort(associates,new AssociateComparator());                       
			
			for(Associate associate :associates) {
				System.out.println(associate);
		}
	}


}
