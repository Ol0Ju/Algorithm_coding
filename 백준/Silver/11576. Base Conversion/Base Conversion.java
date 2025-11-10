import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken()); //A진밥
		int B=Integer.parseInt(st.nextToken()); //B진법
		
		int N=Integer.parseInt(br.readLine()); //자릿수
		
		int re=0;
		st=new StringTokenizer(br.readLine());
		for(int i=N-1;i>=0;i--) {
			int input=Integer.parseInt(st.nextToken());
			re+=input*Math.pow(A, i);
		}
		StringBuilder sb=new StringBuilder();
		Stack<Integer> stack=new Stack<>();
		while(re>0) {
			stack.push(re%B);
			re/=B;
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		System.out.println(sb);
	}
}