package com.bss.j8p.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Input: exp = “[()]{}{[()()]()}” 
		//		Output: Balanced
		//		Input: exp = “[(])” 
		//		Output: Not Balanced
		//		Input exp=“[(]”
		//		Output: Not Balanced 
		
		
		String exp = "[()]{}{[()()]()}";
		String exp1 = "[(])";
		String exp2 = "[(]";
		System.out.println(isBalanced(exp) ? "Balanced" : "Not Balanced");
		System.out.println(isBalanced(exp1) ? "Balanced" : "Not Balanced");
		System.out.println(isBalanced(exp2) ? "Balanced" : "Not Balanced");
	}
	
	private static boolean isBalancedDeque(String exp) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for(int i = 0; i < exp.length(); i++) {
			
		}
		return stack.isEmpty();
		
	}

	private static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if (!isMatchingPair(top, ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private static boolean isMatchingPair(char top, char ch) {
		return (top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']');
	}

}
