package blind75Programs;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String str="{[()]}";
		System.out.println(isValidParanthesis(str));

	}
	
	public static boolean isValidParanthesis(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		for(char ch:str.toCharArray())
		{
			if(ch=='(')
				stack.push(')');
			else if(ch=='[')
				stack.push(']');
			else if(ch=='{')
				stack.push('}');
			else if((stack.isEmpty())||(stack.pop()!=ch))
				return false;
		}
		
		return stack.isEmpty();
	}

}
