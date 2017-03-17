package leetcode;

import java.util.ArrayList;

public class SingleNumber {
public int singleNumber(int[] nums) {
     int output=0;
     for (int i = 0; i < nums.length; i++) {
		output=output^nums[i];
	}     
    System.out.println(output);      
    return output;
    
}
public static void main(String args[]){
	SingleNumber sn=new SingleNumber();
	int[] nums={1};
	sn.singleNumber(nums);
}
}
