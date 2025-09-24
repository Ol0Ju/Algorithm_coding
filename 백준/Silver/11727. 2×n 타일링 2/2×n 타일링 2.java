import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		long[] d=new long[1001];
		d[1]=1;
		d[2]=3;
		for(int i=3;i<=N;i++) {
			d[i]=(d[i-1]+2*d[i-2])%10007;
		}
		System.out.println(d[N]);
	}

}
