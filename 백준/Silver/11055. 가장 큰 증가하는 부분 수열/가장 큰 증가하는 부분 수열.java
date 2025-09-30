import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] s=new int[N+1];
		int[] d=new int[N+1];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
			d[i]=s[i];
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=1;j<i;j++) {
				if(s[i]>s[j]) {
					d[i]=Math.max(d[i],d[j]+s[i]);
				}
			}
		}
		int result=0;
		for(int i=1;i<=N;i++) {
			result=Math.max(d[i], result);
		}
		System.out.println(result);
	}	
}