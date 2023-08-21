import java.util.ArrayList;
// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty[]=-2&sortBy=submissions
public class ValueEqToIndex {

	public static void main(String[] args) {
		int[] arr = {15, 2, 45, 4, 7};
		int n = arr.length;
		System.out.println(valueEqualToIndex(arr,n));

	}
	
	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
	       ArrayList<Integer> l = new ArrayList<>();
	       for(int i=0;i<n;i++){
	           if(arr[i]==(i+1)){
	               l.add(i+1);
	           }
	       }
	       return l;
	    }

}
