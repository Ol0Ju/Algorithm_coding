import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()); //몇 개 받을건지
		int[] w=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			w[i]=Integer.parseInt(br.readLine());
		}
		
		int[] d=new int[N+1];
		if(N>=1) d[1]=w[1];
		if(N>=2) d[2]=w[1]+w[2];
		if(N>=3) d[3]=Math.max(Math.max(w[1]+w[2],w[1]+w[3]),w[2]+w[3]);
		
		for(int i=4;i<=N;i++) {
			d[i]=Math.max(d[i-1],
					Math.max(d[i-2]+w[i],d[i-3]+w[i-1]+w[i]));
		}
		System.out.println(d[N]);
		
	}
}

