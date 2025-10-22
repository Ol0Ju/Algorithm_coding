import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		
		Stack<Integer> stack=new Stack<>(); //스택함수
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			String[] cmd=input.split(" ");
			switch (cmd[0]) {
			case "push":
				int value=Integer.parseInt(cmd[1]);
				stack.push(value);
				break;
			case "pop":
				sb.append(stack.isEmpty()?-1:stack.pop()).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				sb.append(stack.isEmpty()?1:0).append("\n");
				break;
			case "top":
				sb.append(stack.isEmpty()?-1:stack.peek()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}