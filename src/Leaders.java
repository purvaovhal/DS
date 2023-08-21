//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
import java.util.ArrayList;

public class Leaders {

	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        System.out.println(leaders(arr, n));
	}
	
	static ArrayList<Integer> leaders(int arr[], int n){
	       ArrayList<Integer> l = new ArrayList<>();
	       
	       int max = Integer.MIN_VALUE;
	       for(int i=n-1;i>=0;i--){
	           if(arr[i]>=max){
	               l.add(arr[i]);
	               max = arr[i];
	           }
	       }
	       ArrayList<Integer> lr = new ArrayList<>();
	       for(int i=l.size()-1;i>=0;i--){
	           lr.add(l.get(i));
	       }
	       return lr;
	    }

}
