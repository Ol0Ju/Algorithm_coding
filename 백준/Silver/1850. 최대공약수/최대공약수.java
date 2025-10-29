import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		
		long gcd=gcd(a,b);
		for(int i=0;i<gcd;i++) {
			sb.append("1");
		}
		
		System.out.println(sb);
	}

	static long gcd(long a, long b) {
		while(b!=0) {
			long tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
}