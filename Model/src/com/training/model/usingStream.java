package com.training.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



		
	public class usingStream {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

			List<String> list=Arrays.asList("apple","orange","apple","mango");
			List<String> result=list.stream().distinct().collect(Collectors.toList());
			
			list.stream().
			
			System.out.println(result.toString());

		}
}

