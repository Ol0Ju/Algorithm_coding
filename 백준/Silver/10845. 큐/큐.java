import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine()); //명령의 수
		
		Queue<Integer> q=new LinkedList<>();
		int value=-1;
		for(int i=0;i<N;i++) {
			String[] cmd=br.readLine().split(" ");
			switch(cmd[0]) {
				case "push":
					value=Integer.parseInt(cmd[1]);
					q.add(value);
					break;
				case "pop":
					sb.append(q.isEmpty()?-1:q.poll()).append("\n");
					break;
				case "size":
					sb.append(q.size()).append("\n");
					break;
				case "empty":
					sb.append(q.isEmpty()?1:0).append("\n");
					break;
				case "front":
					sb.append(q.isEmpty()?-1:q.peek()).append("\n");
					break;
				case "back":
					sb.append(q.isEmpty()?-1:value).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}	
}