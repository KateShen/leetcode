package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class DisappearedArray {
public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer> result=new ArrayList<>();
     HashSet<Integer> numsstore=new HashSet<>();
     ArrayList<Integer> realstore=new ArrayList<>();
     for (int i = 0; i < nums.length; i++) {
		numsstore.add(nums[i]);
		realstore.add(i+1);
	}
    System.out.println(numsstore); 
    
    for (int i : realstore) {
		if (numsstore.contains(i)) {
			numsstore.remove(i);
		}else {
			numsstore.add(i);
		}
	}
    
    Iterator<Integer> it=numsstore.iterator();
    for (int j = 0; j < numsstore.size(); j++) {
    	result.add(it.next());
	}
    System.out.println(result);
      return result;
    }

public static void main(String args[]) {
	DisappearedArray da=new DisappearedArray();
	int[] nums={1,2,3,4,5,4,3};
	da.findDisappearedNumbers(nums);
}
}
