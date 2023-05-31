package in.ineuron;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		
		int k=scan.nextInt();
		int[] output=targetSum(arr,k, n);
		if(output!=null)
			for(int i=0; i<2; i++) {
				System.out.println(output[i]);
			}
		else {
			System.out.println("Not found......");
		}
		
	}

	private static int[] targetSum(int[] arr, int k, int n) {
		
		int[] ans=new int[2];
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<n; i++) {
			int target= k-arr[i];
			if(map.containsKey(target)) {
				ans[0]=i;
				ans[1]=map.get(target);
				return ans;
			}
			
			map.put(arr[i],i );
		}
		return null;
	}
}
