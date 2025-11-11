import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long n=Long.parseLong(st.nextToken());
		long m=Long.parseLong(st.nextToken());
		
		long count5=count(n,5)-count(m,5)-count(n-m,5);
		long count2=count(n,2)-count(m,2)-count(n-m,2);
		System.out.println(Math.min(count5, count2));
	}

	private static long count(long n, int p) {
		long cnt=0;
		while(n>0) {
			n/=p;
			cnt+=n;
		}
		return cnt;
	}
}