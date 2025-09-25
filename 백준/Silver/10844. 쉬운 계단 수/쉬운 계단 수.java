import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		int mod=1000000000;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		long[][] d=new long[N+1][10];
		
		for(int i=1;i<=9;i++) {
			d[1][i]=1; // 1로 초기화
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=0;j<=9;j++) {
				if(j==0) {
					d[i][j]=d[i-1][1]%mod; //o일때 +1밖에 안 되니까
				}else if(j==9) {
					d[i][j]=d[i-1][8]%mod; //9일때 -1밖에 안되니까
				}else {
					d[i][j]=(d[i-1][j-1]+d[i-1][j+1])%mod; //+1,-1 다 됨
				}
			}
		}
		long result=0;
		for(int i=0;i<=9;i++) {
			result=(result+d[N][i])%mod;
		}
		System.out.println(result);
		
	}

}
