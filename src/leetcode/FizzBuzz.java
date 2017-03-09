package leetcode;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {
public List<String> fizzBuzz(int n) {
	List<String> output = new ArrayList<>();
	
	for (int i = 0; i <n; i++) {
		if ((i+1)%3==0&&(i+1)%5==0) {
		output.add(i, "FizzBuzz");
		}else if ((i+1)%3==0&&(i+1)%5!=0) {
			output.add(i, "Fizz");
		}else if ((i+1)%5==0&&(i+1)%3!=0) {
			output.add(i, "Buzz");
		}else 
			output.add(String.valueOf(i+1));
		
		}
	System.out.println(output);
	return output;
        
    }

public static void main(String args[]) {
	FizzBuzz fb = new FizzBuzz();
	fb.fizzBuzz(15);
	
}
}
