//https://leetcode.com/problems/sort-the-people/
import java.util.Arrays;

public class SortPeople {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] ans = sortPeople(names,heights);
        System.out.println(Arrays.toString(ans));
	}
	
	static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(heights[j-1]<heights[j]){
                    int temp = heights[j-1];
                    heights[j-1] = heights[j];
                    heights[j] = temp;
                    String s = names[j-1];
                    names[j-1] = names[j];
                    names[j] = s;
                }
            }
        }
        return names;
    }

}
