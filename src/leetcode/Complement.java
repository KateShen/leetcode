package leetcode;

public class Complement {
	public int findComplement(int num) {
		int output=0;
		int comple=0;
		String binaryinput=Integer.toBinaryString(num);
		
		for(int i=0;i<binaryinput.length();i++){
			comple = (int) (comple + Math.pow(2, i));
		}
		
		output=comple-num;
		
		return output;
    	}
	public static void main(String args[]) {
		Complement cp=new Complement();
		cp.findComplement(1);
	
	}

}
