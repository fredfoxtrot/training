import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[]{4,9,5}, new int[] {	9,4,9,8,4}));
	}
	
	 public static int[] singleNumber(int[] nums, int[] nums2) {
	        
		 HashMap<Integer,Integer> map = new HashMap();
		 
		 
		 //create short version of nums with hashmap
		 for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		 }
		 
		 //compare and put if array if found cd 
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 for (int  i : nums2) {
			if(map.containsKey(i)) {				
				result.add(i);
				map.put(i, map.get(i)-1);
				//remove if its 0, so we dont keep on adding
				map.remove(i, 0);
			}
		}
		 
		 //create return value
		 int returnVal[] = new int[result.size()];
		 for(int i=0 ; i < result.size() ; i++) {
			returnVal[i]=result.get(i);
		}
		 
		 return returnVal;
	 }

}
