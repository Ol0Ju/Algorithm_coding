import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] d=new int[N];
		int ans=0;
		for(int i=0;i<N;i++) {
			int cnt=0;
			d[i]=Integer.parseInt(st.nextToken());
			if(d[i]>1) {
				for(int j=2;j<=d[i];j++) {
					if(d[i]%j==0) cnt++;
				}
				if(cnt==1) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}