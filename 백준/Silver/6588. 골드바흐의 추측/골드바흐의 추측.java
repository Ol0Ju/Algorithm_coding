import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		boolean[] isPrime=sieve(1000000); //백만
		while(true) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) break;
			
			boolean found=false;
			
			/*
			왜 a~n/2까지만 탐색하냐?
			(a,b)<-(b,a) 중복
			a ≤ b 조건 만족
			*/
			for(int a=3;a<=n/2;a+=2) {
				if(isPrime[a]&&isPrime[n-a]) {
					sb.append(n).append(" = ")
						.append(a).append(" + ")
						.append(n-a).append("\n");
					found=true;
					break;
				}
			}
			if(!found) {
				sb.append("Goldbach's conjecture is wrong.\n");
			}
		}
		System.out.println(sb);
			
	}

	private static boolean[] sieve(int n) {
		boolean[] prime=new boolean[n+1];
		Arrays.fill(prime, true);
		
		prime[0]=prime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			if(prime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					prime[j]=false;
				}
			}
		}
		return prime;
	}
}