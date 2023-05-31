package in.ineuron;

import java.util.Scanner;

public class Question2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int key=s.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		
		System.out.println(replaceNumber(arr, key));
		for(int i: arr)
		System.out.print(i+" ");
	}
	
	public static int replaceNumber(int[] arr, int key) {
		
		
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(key!=arr[i]) {
				arr[k++]=arr[i];

			}
		}
		
		return k;
	}
}


