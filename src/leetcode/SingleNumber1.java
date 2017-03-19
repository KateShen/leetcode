package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber1 {
public int singleNumber(int[] nums) {
//     int output=0;
//     for (int i = 0; i < nums.length; i++) {
//		output=output^nums[i];
//	}     
//    System.out.println(output);      
//    return output;
//    }
	HashMap<Integer,Integer> store=new HashMap<>();
	for(int i=0;i<nums.length;i++){
		if (store.containsKey(nums[i])){
			store.remove(nums[i]);
		}else {
			store.put(nums[i], 1);
		}
	}
	Set<Integer> storeaa=store.keySet();
	Iterator<Integer> i= storeaa.iterator();
	int result = i.next();
	System.out.println(result);
	return result;
}
	




public static void main(String args[]){
	SingleNumber1 sn=new SingleNumber1();
	int[] nums={1};
	sn.singleNumber(nums);
}
}
