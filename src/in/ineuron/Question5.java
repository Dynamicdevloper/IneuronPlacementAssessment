package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int m=fs.nextInt(); 
		int n=fs.nextInt();
		int[] arr1=new int[m+n];
		
		int[]arr2=new int[n];
		
		for(int i=0; i<m; i++) {
			arr1[i]=fs.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			arr2[i]=fs.nextInt();
		}
		
		merge(arr1, arr2, m, n);
		
		for(int i: arr1) {
			System.out.print(i+" ");
		}
	}

	private static void merge(int[] arr1, int[] arr2, int m, int n) {
		
		int i=0; 
		int j=0;
		int k=0; 
		int[] arr =new int[m];
		for(int ind=0; ind<m; ind++) arr[ind]=arr1[ind];
		while(i<m && j<n) {
			if(arr[i]<arr2[j]) {
				arr1[k++]=arr[i++];
			}else {
				arr1[k++]=arr2[j++];
			}
		}
		
		while(i<m) {
			arr1[k++]=arr[i++];
		}
		
		while(j<n) {
			arr1[k++]=arr2[j++];
		}
	}
}







