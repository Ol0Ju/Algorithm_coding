import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(br.readLine());
			long[] d=new long[101];
			
			d[0]=1;
			d[1]=1;
			d[2]=1;
			for(int j=3;j<N;j++) {
				d[j]=d[j-3]+d[j-2];
			}
			sb.append(d[N-1]).append("\n");
		}
		System.out.println(sb);
	}
}

