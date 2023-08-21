// https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&sortBy=submissions
public class PalindromicArray {

	public static void main(String[] args) {
		int[] a = {111, 222, 333, 444, 515};
        int n = a.length;
        System.out.println(palinArray(a,n));
	}
	
	public static int palinArray(int[] a, int n)
    {
          for(int i=0;i<n;i++){
              int num = a[i];
              int res = 0;
              while(a[i]>0){
                  int r = a[i]%10;
                  res = res * 10 + r;
                  a[i] /= 10;
              }
              if(res!=num){
                  return 0;
              }
          }
          return 1;
    } 

}
