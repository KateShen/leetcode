package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.midi.Soundbank;

public class MaxConsecutiveOnes {
public int findMaxConsecutiveOnes(int[] nums) {
	int output=0;
    int result=0;
     ArrayList<Integer> store = new ArrayList<Integer>();

     ArrayList< ArrayList<Integer>> storeup=new ArrayList<>();
     for (int i = 0; i < nums.length; i++) {
		if (nums[i]==1) {
			output++;
		}else if (nums[i]==0) {
			store.add(output);
			output=0;
			store.add(output);
		}
     }	
     store.add(output);
     
     for (int i = 0; i < store.size(); i++) {
		if (store.get(i)>result) {
			result=store.get(i);
		}
	}
     System.out.print(result);
		
     return result;
    }

public static void main(String args[]) {
	MaxConsecutiveOnes mco=new MaxConsecutiveOnes();
	int[] nums={1,0,1,1,1,0,0,1,1,1,1,1};
	mco.findMaxConsecutiveOnes(nums);
}
}
