package com.nt;

import java.util.ArrayList;
import java.util.List;

public class UniqueValuesformlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("banana");
		list1.add("grapes");
		list1.add("watermilaon");

		List<String> list2 = new ArrayList<String>();
		list2.add("mallesh");
		list2.add("banana");
		list2.add("Satwik");
		list2.add("Sri");

		List<String> list = new ArrayList<String>();
		
		System.out.println(list2.retainAll(list1));
		System.out.println(list2);
		
			for (String string : list1) {
				if (list2.contains(string)) {
					list.add(string);
				}
			

		}
			System.out.println(list);

	}

}
