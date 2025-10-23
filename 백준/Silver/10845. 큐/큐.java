import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine()); //명령의 수
		
		int[] q=new int[N];
		int front=0;
		int back=0;
		for(int i=0;i<N;i++) {
			String[] cmd=br.readLine().split(" ");
			switch(cmd[0]) {
				case "push":
					q[back++]=Integer.parseInt(cmd[1]);
					break;
				case "pop":
					if(front==back) {
						sb.append(-1).append("\n");
					}else {
						sb.append(q[front++]).append("\n");
					}
					break;
				case "size":
					sb.append(back-front).append("\n");
					break;
				case "empty":
					sb.append(front==back?1:0).append("\n");
					break;
				case "front":
					sb.append(front==back?-1:q[front]).append("\n");
					break;
				case "back":
					sb.append(front==back?-1:q[back-1]).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}	
}