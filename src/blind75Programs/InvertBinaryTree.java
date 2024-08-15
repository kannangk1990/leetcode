package blind75Programs;

public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root =new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));
		inorder(root);
		System.out.println();
		inorder(invertBinaryTree(root));
		
	}
	
	public static void inorder(TreeNode root) {
	    if (root != null) {
	    	System.out.print(root.val + " ");
	    	inorder(root.left);
	        inorder(root.right); 
	    }
	}
	
	public static TreeNode invertBinaryTree(TreeNode root)
	{
		if(root==null)
			return null;
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
		
		return root;
	}
}
