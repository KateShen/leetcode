package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.xml.namespace.QName;

public class Findwords {
public String[] findWords(String[] words) {
    String[] output=words;
//    String[] l1={"q","w","e","r","t","y","u","i","o","p"};
//    String[] l2={"a","s","d","f","g","h","j","k","l"};
//    String[] l3={"z","x","c","v","b","n","m"};
    ArrayList<String> line1=new ArrayList<>();
    line1.add("q");line1.add("w");line1.add("e");line1.add("r");line1.add("t");line1.add("y");line1.add("u");line1.add("i");line1.add("o");line1.add("p");
    ArrayList<String> line2=new ArrayList<>();
    line2.add("a");line2.add("s");line2.add("d");line2.add("f");line2.add("g");line2.add("h");line2.add("j");line2.add("k");line2.add("l");
    ArrayList<String> line3=new ArrayList<>();
    line3.add("z");line3.add("x");line3.add("c");line3.add("v");line3.add("b");line3.add("n");line3.add("m");
    ArrayList<String> outputarray = new ArrayList<>();
    Collections.addAll(outputarray, words);
    //System.out.println(outputarray);
    
    System.out.println(line1);
    System.out.println(line2);
    System.out.println(line3);
    ArrayList<Integer> total = new ArrayList<>();
   
    for(int i=0;i<words.length;i++){
    	ArrayList<Integer> num = new ArrayList<>();
    	int count = 0;
    	String wordslow = words[i].toLowerCase();
    	for(int j=0;j<wordslow.length();j++){
    		if (line1.contains(wordslow.substring(j,j+1))) {
				num.add(1);
			}else if (line2.contains(wordslow.substring(j,j+1))) {
				num.add(2);
			}else if(line3.contains(wordslow.substring(j,j+1))){
				num.add(3);
			}
    	}
    	for(int k=0;k<num.size()-1;k++){
    		if (num.get(k)!=num.get(k+1)) {
    			//total.add(i);
    			outputarray.remove(words[i]);
    			break;
			}
    	}   	
    }
    
    //System.out.println(total);
    
    System.out.println(outputarray);
	return outputarray.toArray(new String[outputarray.size()]);
    }
    

public static void main(String args[]) {
	Findwords fw = new Findwords();
	String[] input={"Hello", "Alaska", "Dad", "Peace"};
	fw.findWords(input);
	
}

}
