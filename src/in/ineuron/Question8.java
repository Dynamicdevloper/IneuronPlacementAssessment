package in.ineuron;

import java.util.HashSet;

public class Question8 {
	public static void main(String[] args) {
		
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		
		int[] ans= duplicates(arr, n);
		for(int i: ans) {
			System.out.println(i+" ");
		}
	}

	private static int[] duplicates(int[] arr, int n) {
		int[] ans=new int[2];
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0; i<n; i++) {
			if(set.contains(arr[i])) {
				ans[0]=arr[i];
				continue;
			}
			
			set.add(arr[i]);
		}
		
		for(int i=1; i<=n; i++) {
			if(!set.contains(i)) {
				ans[1]=i;
				break;
			}
		}
		return ans;
	}
}
