package com.comit.course_03_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i0 = 0;
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 4;
		int i5 = 5;
		int i6 = 6;
		int i7 = 7;
		int i8 = 8;
		int i9 = 9;
		
		int[] a = { 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9,10 };
		
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * int j = a[i]; System.out.println(j);
		 * 
		 * }
		 */
		
		for(int i : a) {
			
			System.out.println(i);
		}
		
		//Java library Arrays prints out the elements in a single line
		//System.out.println(Arrays.toString(a));
		
		//2nd way to create an array
		int[] c = new int[10];
		c[4] = 107;
		c[c.length-1] = 108;
		System.out.println(Arrays.toString(c));
			
		
		
		}

	}


