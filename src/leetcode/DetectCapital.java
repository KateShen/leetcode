package leetcode;
import java.util.ArrayList;

public class DetectCapital {
public boolean detectCapitalUse(String word) {
	ArrayList<Integer> store = new ArrayList<>();
	for(int i=0;i<word.length();i++){
		if (word.charAt(i)>=97) {
			store.add(1);
		}else {
			store.add(0);
		}
	}	
	int outputC=0;
	int outputL=0;
	for (int i = 0; i < store.size(); i++) {
		if (store.get(i)==0) {
			outputC++;
		}
		else {
			outputL++;
		}
	}	
	if (store.get(0)==0 && outputC==store.size()) {return true;}
	else if (store.get(0)==0 && outputL+1==store.size()) {return true;}
	else if (store.get(0)==1 && outputL==store.size()) {return true;}
	else 
		return false;

 }

public static void main(String args[]) {
	DetectCapital dc= new DetectCapital();
	String word="usa";//test
	System.out.println(dc.detectCapitalUse(word));
	
}
}
