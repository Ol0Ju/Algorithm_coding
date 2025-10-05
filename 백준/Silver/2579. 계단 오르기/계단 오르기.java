import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] s=new int[N+1];
		int[] d=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			s[i]=Integer.parseInt(br.readLine());
		}
		
		d[1]=s[1];
        if(N>=2) {
			d[2]=s[1]+s[2];
		}
		
		for(int i=3;i<=N;i++) {
			d[i]=s[i]+Math.max(s[i-1]+d[i-3], d[i-2]);
		}
		System.out.println(d[N]);
	}
}