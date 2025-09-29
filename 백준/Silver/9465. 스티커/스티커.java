import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			int[][] s=new int[2][n];
			
			for(int i=0;i<2;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				for(int j=0;j<n;j++) {
					s[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			//초기화
			int d[][]=new int[2][n];
			d[0][0]=s[0][0];
			d[1][0]=s[1][0];
			
			if(n>1) {
				d[0][1]=s[0][1]+d[1][0];
				d[1][1]=s[1][1]+d[0][0];
			}
			for(int i=2;i<n;i++) {
				d[0][i]=Math.max(d[1][i-1],d[1][i-2])+s[0][i];
				d[1][i]=Math.max(d[0][i-1],d[0][i-2])+s[1][i];
			}
			sb.append(Math.max(d[0][n-1], d[1][n-1])).append("\n");
		}
		System.out.println(sb);
	}

}
