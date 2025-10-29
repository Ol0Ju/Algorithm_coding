import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		int re1=gcd(A,B);
		sb.append(re1).append("\n");
		sb.append(A*B/re1);
		System.out.println(sb);
	}

	static int gcd(int a, int b) {
		while(b!=0) {
			int tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
}