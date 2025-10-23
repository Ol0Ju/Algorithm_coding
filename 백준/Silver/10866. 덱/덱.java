import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		int[] dq=new int[2*N];
		int front=N;
		int back=N;
		
		for(int i=0;i<N;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			String cmd=st.nextToken();
			switch(cmd) {
				case "push_front":
					int x1=Integer.parseInt(st.nextToken());
					dq[--front]=x1;
					break;
				case "push_back":
					int x2=Integer.parseInt(st.nextToken());
					dq[back++]=x2;
					break;
				case "pop_front":
					sb.append(front==back?-1:dq[front++]).append("\n");
					break;
				case "pop_back":
					sb.append(front==back?-1:dq[--back]).append("\n");
					break;
				case "size":
					sb.append(back-front).append("\n");
					break;
				case "empty":
					sb.append(front==back?1:0).append("\n");
					break;
				case "front":
					sb.append(front==back?-1:dq[front]).append("\n");
					break;
				case "back":
					sb.append(front==back?-1:dq[back-1]).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}	
}