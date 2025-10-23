import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		int value=0;
		
		Deque<Integer> dq=new ArrayDeque();
		for(int i=0;i<N;i++) {
			String[] cmd=br.readLine().split(" ");
			switch(cmd[0]) {
				case "push_front":
					value=Integer.parseInt(cmd[1]);
					dq.addFirst(value);
					break;
				case "push_back":
					value=Integer.parseInt(cmd[1]);
					dq.addLast(value);
					break;
				case "pop_front":
					sb.append(dq.isEmpty()?-1:dq.pollFirst()).append("\n");
					break;
				case "pop_back":
					sb.append(dq.isEmpty()?-1:dq.pollLast()).append("\n");
					break;
				case "size":
					sb.append(dq.size()).append("\n");
					break;
				case "empty":
					sb.append(dq.isEmpty()?1:0).append("\n");
					break;
				case "front":
					sb.append(dq.isEmpty()?-1:dq.peekFirst()).append("\n");
					break;
				case "back":
					sb.append(dq.isEmpty()?-1:dq.peekLast()).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}	
}