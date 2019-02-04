package com.cg.project.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class MapClassesDemo {
	public static void hashTableClassWork() {
		Hashtable<Integer,Associate>associates=new Hashtable<>();
		associates.put(100,new Associate(100,"Anup","Banerjee",12000));
		associates.put(101,new Associate(101,"Ashik","Rahman",12000));
		associates.put(102,new Associate(102,"Anirban","Barat",12000));
		associates.put(103,new Associate(103,"Neha","Sharma",12000));
		associates.put(104,new Associate(104,"Kuldeep","Dangwal",12000));
		
		Associate associate=associates.get(102);
		associates.remove(102);
		
		Set<Integer> keys=associates.keySet();
		for(Integer key:keys) {
			System.out.println(associates.get(key));
		}
		ArrayList<Associate>associateList=new ArrayList<>(associates.values());
	}
}
