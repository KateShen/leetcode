package leetcode1;

public class MaximumDepthBinaryTree {
	public class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			value = x;
		}
	}
	 public int maxDepth(TreeNode root) {
	        if (root==null) {
				return 0;
	        }
	        
	        else {
				int l=maxDepth(root.left);
				int r=maxDepth(root.right);
				if (l>r) {
					return l+1;
				}
				else {
					return r+1;
				}	
	        }
	 
	 }

}
