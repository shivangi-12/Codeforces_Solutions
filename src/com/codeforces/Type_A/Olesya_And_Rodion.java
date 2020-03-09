package com.codeforces.Type_A;

import java.util.Scanner;

public class Olesya_And_Rodion {
public static int  check_condition(int n,int t) {
	//If we are allowed to have n digits then, num will start from 10^(n-1) to (10^n)-1
	double start_from=Math.pow(10,n-1);
	double end_to=Math.pow(10, n)-1;
	int num=(int) (start_from+1);
	while(num>start_from &&num<end_to) {
		if(num%t==0)
			return num;
		else
			num++;
	}
	
	return -1;
	
}
public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	int n;
	int t;
	n=in.nextInt();
	t=in.nextInt();
	System.out.println(check_condition(n, t));
}
}
