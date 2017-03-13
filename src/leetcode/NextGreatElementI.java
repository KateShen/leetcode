package leetcode;
import java.util.ArrayList;

public class NextGreatElementI {
public int[] nextGreaterElement(int[] findNums, int[] nums) {
	
	int[] output=findNums;
	ArrayList<Integer> line1=new ArrayList<>();
	for(int i=0;i<findNums.length;i++){
		line1.add(findNums[i]);
	}
	System.out.println(line1);
	ArrayList<Integer> line2=new ArrayList<>();
	for(int j=0;j<nums.length;j++){
		line2.add(nums[j]);
	}
	System.out.println(line2);
	for(int k=0;k<line1.size();k++){
		int number=line1.get(k);
		int number2 = line2.indexOf(number)+1;
		if (number2>=line2.size()) {
			output[k]=-1;
		}else if (number2<line2.size()) {	
			if (line2.get(number2)<number) {
				for (int l = number2; l < line2.size(); l++) {
					if (line2.get(l)>number) {
						 output[k]=line2.get(l);
						 break;
					}else {
						output[k]=-1;
					}
				}
			
		}else if (line2.get(number2)>number) {
			output[k]=line2.get(number2);
		}
	}
		}
	
	System.out.println(output[0]);
	System.out.println(output[1]);
	System.out.println(output[2]);
	System.out.println(output[3]);
	System.out.println(output[4]);
	
	return output;
        
    }

public static void main(String args[]) {
	NextGreatElementI ng=new NextGreatElementI();
	int[] a={1,3,5,2,4};
	int[] b={6,5,4,3,2,1,7};
	
	//int[] a={4,1,2};
	//int[] b={1,3,4,2};
	ng.nextGreaterElement(a, b);
}

}