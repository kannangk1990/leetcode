package blind75Programs;

public class SameTree {

	//TreeNode is defined in another class so need to define here since 
	// in same package
	public static void main(String[] args) {
		TreeNode firstTree =new TreeNode(1,new TreeNode(2),new TreeNode(1));
		TreeNode secondTree =new TreeNode(1,new TreeNode(1),new TreeNode(2));
		System.out.println(isSameTree(firstTree,secondTree));

	}
	
	public static boolean isSameTree(TreeNode firstTree,TreeNode secondTree)
	{
		if(firstTree==null && secondTree==null)
			return true;
		if(firstTree==null || secondTree==null || firstTree.val!=secondTree.val)
			return false;
		
		return isSameTree(firstTree.left,secondTree.left) && isSameTree(firstTree.right,secondTree.right);
	}
}


