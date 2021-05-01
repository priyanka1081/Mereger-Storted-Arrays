package Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {5,6,7};
		MergeSortedArray mer= new MergeSortedArray();
		
		int[] c=mer.mergeArrays(a, b);
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public int[] mergeArrays(int[] a, int[] b) {
		int len=a.length+b.length;
		int[] c = new int[len];
		
		int first= a[0];
		int sec= b[0];
		int i=0;
		int j=1;
		int k=1;
		
		while(i<len) {
			System.out.println(first+ " : " + sec);
			if(first<sec && (k!=b.length) && (j!=a.length)) {
				c[i]=first;
				i++;
				first= a[j];
				j++;
			}else{ 
				c[i]=sec;
				i++;
				sec= b[k];
				k++;
			}
		}
		return c;
	}

}
