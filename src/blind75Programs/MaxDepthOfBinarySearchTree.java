package blind75Programs;



public class MaxDepthOfBinarySearchTree {

	public static void main(String[] args) {
		
		TreeNode binTree =new TreeNode(3, new TreeNode(9),new TreeNode(20, new TreeNode(15),new TreeNode(7)));
		System.out.println(depthofTree(binTree));
	}
	
	public static int depthofTree(TreeNode node)
	{
		if (node==null)
			return 0;
		int leftMax=depthofTree(node.left);
		int rightMax=depthofTree(node.right);
		
		return Math.max(leftMax, rightMax)+1;
		
	}

}

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode() {};
	
	TreeNode(int val)
	{
		this.val=val;
	}
	
	TreeNode(int val,TreeNode left,TreeNode right)
	{
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	
}
