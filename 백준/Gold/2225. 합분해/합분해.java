import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int mod=1000000000;
		//정수 k개로 그 합이 n이 되는 경우의 수
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int[][] dp=new int[k+1][n+1];
		for(int i=1;i<=k;i++) {
			//k개의 수를 더해 0을 만드는 방법은 한 가지
			dp[i][0]=1;
		}
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
			}
		}
		System.out.println(dp[k][n]);
	}
}