package com.haley.huawei;

import java.util.Scanner;

public class BestGrade {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			
			int n = input.nextInt();
			int m = input.nextInt();
			int arr[] = new int[n+1];
			for(int i=1; i<=n; i++) {
				arr[i] = input.nextInt();
			}
			for(int i=0; i<m; i++) {
				int max = 0;
				String str = input.next();
				char c = str.charAt(0);
				int a = input.nextInt();
				int b = input.nextInt();
				if(c == 'Q') {
					if(b < a) {
						int temp = a;
						a = b;
						b = temp;
					}
					for(int j=a; j<=b; j++) {
						if(arr[j] > max) {
							max = arr[j];
						}
					}
					System.out.println(max);
				}else if(c == 'U'){
					arr[a] = b;
				}
			}
			
			
		}
		
	}
	

}
