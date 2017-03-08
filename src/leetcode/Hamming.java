package leetcode;


public class Hamming {
	 public static void main(String args[]){
		 Hamming hm=new Hamming();
		 hm.hammingDistance(1, 4);
		 System.out.print("4");
		 
	 } 
	
	public int hammingDistance(int x, int y) {
		
//		 int distance=0;
//		 String numX = Integer.toBinaryString(x);
//		 String numY = Integer.toBinaryString(y);
//		 
//		 for(int i=1;i<31;i++){
//			 String a=null;
//			 String b=null;
//			 while(i<=numX.length()){
//				  a = numX.substring(numX.length()-i,numX.length()-i+1);
//			 }
//			 
//			 while(i<=numY.length()){
//				  b = numY.substring(numY.length()-i,numY.length()-i+1);
//			 }
//			 
//			 if(!a.equals(b)){
//				 distance++;
//			 }
//		 } 
//		 return distance;
		return Integer.bitCount(x^y);
	    }
	

}
