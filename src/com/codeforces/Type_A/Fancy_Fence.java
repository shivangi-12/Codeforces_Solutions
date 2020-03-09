package com.codeforces.Type_A;

import java.util.Scanner;

public class Fancy_Fence {
public static void main(String args[]) {
	int t;
	Scanner in=new Scanner(System.in);
	t=in.nextInt();
	int a[]=new int[10];
	int i=0;
	int te=t;
	while(t>0) {
		a[i]=in.nextInt();
		i++;
		t--;
	}
	for(int j=0;j<te;j++) {
		if((a[j]>=60)&&(180%a[j]==0)) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
	
}
}
