import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int m=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		
		boolean[] prime=sieve(n);
		
		StringBuilder sb=new StringBuilder();
		for(int i=m;i<=n;i++) {
			if(prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

	//에라토스테네스의 체
	private static boolean[] sieve(int n) {
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		if(n>=0) isPrime[0]=false;
		if(n>=1) isPrime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					isPrime[j]=false;
				}
			}
		}
		return isPrime;
	}
}