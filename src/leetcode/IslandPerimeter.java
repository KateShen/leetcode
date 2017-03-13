package leetcode;

import java.util.ArrayList;

public class IslandPerimeter {
public int islandPerimeter(int[][] grid) {
     int output = 0;
     ArrayList<Integer> count1=new ArrayList<>();
     ArrayList<Integer> count2=new ArrayList<>();
     //System.out.println(grid.length);
     for (int i = 0; i < grid.length; i++) {
    	 int line=0;
		for (int j = 0; j < grid[i].length; j++) {
			if (grid[i][j]==1) {
				line++;
			}
		}
		count1.add(line);
		//System.out.println(count1);
	}
  System.out.println(count1);
//     
//     for (int i = 0; i < grid.length; i++) {
//    	 int line=0;
//		for (int j = 0; j < grid[i].length; j++) {
//			if (grid[j][i]==1) {
//				line++;
//			}
//		}
//		count2.add(line);
		//System.out.println(count2);
     
     
     for (int i = 0; i < grid[0].length; i++) {
    	 int line=0;
		for (int j = 0; j < grid.length; j++) {
			if (grid[j][i]==1) {
				line++;
			}
		}
		count2.add(line);
	}
     System.out.println(count2);
     
     int total1 = count1.get(0)+count1.get(count1.size()-1);
     int total2 = count2.get(0)+count2.get(count2.size()-1);
     
     for (int i = 0; i< count1.size(); i++) {
    	 	if (count1.size()==2) {
    	 		total1+=count1.get(i);
			}else if (count1.size()==1) {
			
			}}
     for (int i = 0; i+1< count1.size(); i++) {
    	 if (count1.size()>=3) {
    		 total1+=count1.get(i)+count1.get(i+1);
		}
}
			
		
	
     System.out.println(total1);
     
     for (int i = 0; i < count2.size(); i++) {
    	 	if (count2.size()==2) {
    	 		total2+=count2.get(i);
			}
    	 	else if (count2.size()==1) {
    			
			}}
     for (int i = 0; i+1 < count2.size(); i++) {
    	 if (count2.size()>=3) {
				total2+=count2.get(i)+count2.get(i+1);
			}
			
		
	}
     System.out.println(total2);
     
     int repetition1 = 0; 
     for (int i = 0; i < grid.length; i++) {
    	
		for (int j = 0; j+1 < grid[i].length; j++) {
			if (grid[i][j]==1&& grid[i][j+1]==1) {
				repetition1++;
			}
		}
		
	}
     System.out.println(repetition1);
     
     int repetition2 = 0; 
     for (int i = 0; i < grid[0].length; i++) {
    	
		for (int j = 0; j+1 < grid.length; j++) {
			if (grid[j][i]==1&& grid[j+1][i]==1) {
				repetition2++;
			}
		}
		
	}
     System.out.println(repetition2);
    
     output=total1+total2-repetition1*2-repetition2*2;
     
     
     
     
     
     
     
     System.out.println(output);
     return output;
    }

public static void main(String args[]) {
	IslandPerimeter ip=new IslandPerimeter();
	int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
	//int[][] grid={{0,1,1},{1,1,0}};
	//int[][] grid={{1}};
	ip.islandPerimeter(grid);
}
}
