import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<T;i++) {
			int N=Integer.parseInt(br.readLine());
			long[] d=new long[11];
			d[1]=1;
			d[2]=2;
			d[3]=4;
			for(int j=4;j<=N;j++) {
				d[j]=d[j-1]+d[j-2]+d[j-3];
			}
			sb.append(d[N]+"\n");
		}
		br.close();
		System.out.println(sb);
	}
}