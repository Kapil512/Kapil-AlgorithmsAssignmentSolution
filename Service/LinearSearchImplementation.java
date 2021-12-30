package com.greatlearning.Service;
public class LinearSearchImplementation {
	
	public int search(double value,double[] arr) {
		
			for(int i=0; i<arr.length;i++)
			{
				if(arr[i] == value)
				return i;
			}
			return -1;

		}
}