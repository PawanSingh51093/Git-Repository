package com.texcel;

public class Array {

	public static void main(String[] args) {

		int a[]= {1,2,5,6,9,4,8,21,25};
		
		int n=a.length;
		int b=21;
		
		for(int i=0; i<n; i++) {
			if(a[i]==b) {
        System.out.println(i);
        
			}
		}
		System.out.println(-1);
	}

}
