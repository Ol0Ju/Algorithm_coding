import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 첫째줄 수의 개수 N, 합을 구해야 하는 횟수 M 입력
		// 둘쨰줄 N개의 수 입력
		// 셋째줄 횟수 M의 구간i, j 입력
		BufferedReader br
			=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		long[] S=new long[N+1];
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			//합배열공식
			S[i]=S[i-1]+Integer.parseInt(st.nextToken());
		}
		for(int m=0;m<M;m++) {
			st=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			//구간합공식
			System.out.println(S[j]-S[i-1]);
		}
	}

}
