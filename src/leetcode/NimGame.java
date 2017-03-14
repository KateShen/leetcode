package leetcode;

public class NimGame {
	 public boolean canWinNim(int n) {
		if (n%4!=0) {
			System.out.println("true");
			return true;
		}
		 else 
			 System.out.println("false");
			 return false;
		 
		 
		 
		 
		
	    }
	 public static void main(String args[]) {
		NimGame ng=new NimGame();
		ng.canWinNim(5);
	}
}
