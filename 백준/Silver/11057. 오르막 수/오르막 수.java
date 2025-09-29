import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		long mod = 10007;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long[][] d = new long[N+1][10];
		for(int i=0;i<10;i++) {
			d[1][i]=1; //한자리 수인데 마지막 수가 i인 것(0,1,2,3,,,9)
		}
		for(int i=2;i<=N;i++) {
			d[i][0]=1; //0,00,000
			for(int j=1;j<10;j++) {
				d[i][j]=(d[i][j-1]+d[i-1][j])%mod;
			}
		}
		long a = 0;
		for(int i=0;i<10;i++) {
			a+=d[N][i];
		}
		System.out.println(a%mod);
	}

}
