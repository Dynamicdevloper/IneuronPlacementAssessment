package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=fs.nextInt();
		}
		moveZero(arr,n);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	private static void moveZero(int[] arr, int n) {
		
		int left=0;
		int right=1;
		
		while(right<n) {
			if(arr[left]==0 && arr[right]!=0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right++;
			}else if(arr[left]==0 && arr[right]==0) {
				right++;
			}else {
				left++;
				right++;
			}
		}
	}
}
