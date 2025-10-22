import java.io.*;
import java.util.*;

class Stack{
	private int[] stack;
	private int top;
	
	public Stack(int size) {
		stack=new int[size];
		top=-1;
	}
	
	public void push(int value) {
		stack[++top]=value;
	}
	
	public int pop() {
		if(top==-1)	return -1;
		return stack[top--];
	}
	
	public int size() {
		return top+1;
	}
	
	public int empty() {
		return (top==-1)?1:0;
	}
	
	public int top() {
		if(top==-1) return -1;
		return stack[top];
	}
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		Stack stack=new Stack(N);
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			String[] cmd=input.split(" ");
			
			switch(cmd[0]) {
				case "push":
					stack.push(Integer.parseInt(cmd[1]));
					break;
				case "pop":
					sb.append(stack.pop()).append("\n");
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					sb.append(stack.empty()).append("\n");
                    break;
				case "top":
					sb.append(stack.top()).append("\n");
                    break;
			}		
		}
		System.out.println(sb);
	}
}