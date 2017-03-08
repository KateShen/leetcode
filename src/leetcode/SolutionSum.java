package leetcode;


import java.util.HashMap;

public class SolutionSum {
	public static void main(String args[]){
		int[] nums={2,7,11,15};
		int target = 9;
		SolutionSum sl=new SolutionSum();
		sl.twoSum(nums, target);
		
	}	
	
	public int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> numbers = new HashMap<>();
		int a = nums.length;
		int[] twonum = new int[2];
		for(int b=0; b<a;b++){
			if (numbers.containsKey(nums[b])) {
			twonum[0] = numbers.get(nums[b]);
			twonum[1] = b;
			}
			else {
				numbers.put(target-nums[b], b);
			}
			}
		System.out.println(twonum[1]);
		return twonum;
		
	}

}
