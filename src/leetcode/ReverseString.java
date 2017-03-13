package leetcode;
import java.lang.StringBuffer;
public class ReverseString {
public String reverseString(String s) {
	StringBuffer output = new StringBuffer();
	
	
	for (int i = s.length(); i >0; i--) {
		output.append(s.substring(i-1, i));
	}
	String end = output.toString();
	System.out.println(end);
	return end;
        
    }

public static void main(String args[]) {
	ReverseString rs=new ReverseString();
	String a="hello";
	rs.reverseString(a);
}

}
