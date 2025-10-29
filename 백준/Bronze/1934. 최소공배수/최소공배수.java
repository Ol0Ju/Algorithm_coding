import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine()); //명령수
		
		for(int i=0;i<T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			sb.append(lcm(A,B)).append("\n");
		}
		System.out.println(sb);
	}

	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
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