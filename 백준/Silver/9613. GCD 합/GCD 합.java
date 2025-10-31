import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		int[] tt=new int[100];
		
		
		for(int i=0;i<T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			for(int j=0;j<n;j++) {
				tt[j]=Integer.parseInt(st.nextToken());
			}
			long re=0;
			for(int k=0;k<n;k++) {
				for(int m=k+1;m<n;m++) {
					re+=gcd(tt[k],tt[m]);
				}
			}
			sb.append(re).append("\n");	
		}
		
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