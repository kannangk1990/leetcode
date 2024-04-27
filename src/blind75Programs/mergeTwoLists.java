package blind75Programs;

public class mergeTwoLists {
	
	public class ListNode
	{
		int val;
		ListNode() {};
		ListNode next;
		
		ListNode(int val)
		{
			this.val = val;
		}
		
		ListNode(int val, ListNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode mergeLists(ListNode node1,ListNode node2)
	{
		if(node1 != null && node2 != null)
		{
			if(node1.val<node2.val)
			{
				node1.next=mergeLists(node1.next,node2);
				return node1;
			}
			else
			{
				node2.next=mergeLists(node1,node2.next);
				return node2;
			}
		}
		
		else if(node1 == null)
		{
			return node2;
		}
		
		return node1;
	}

	

}
