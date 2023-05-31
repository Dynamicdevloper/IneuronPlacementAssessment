package in.ineuron;

import java.util.HashSet;

public class Question6 {

	public static void main(String[] args) {
		
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		boolean ans= checkTwice(arr,n);
		System.out.println(ans);
	}

	private static boolean checkTwice(int[] arr, int n) {
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<n; i++) {
			if(hs.contains(arr[i])) {
				return true;
			}
			hs.add(arr[i]);
		}
		
		return false;
	}
}
