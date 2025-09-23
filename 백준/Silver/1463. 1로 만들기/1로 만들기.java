import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] dp=new int[N+1]; //배열 인덱스를 숫자랑 맞추려고
		dp[1]=0; //1은 연산 필요 없음
		
		for(int i=2;i<=N;i++) {
			dp[i]=dp[i-1]+1; //기본적으로 1을 뺌
			if(i%2==0) {
				dp[i]=Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i]=Math.min(dp[i], dp[i/3]+1);
			}
		}
		System.out.println(dp[N]);
	}

}
