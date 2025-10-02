import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] s=new int[N];
		int[] ic=new int[N]; //증가되는 배열
		int[] dc=new int[N]; //감소되는 배열
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
			ic[i]=dc[i]=1;
		}
		int result=0;
		
		//LIS
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(s[i]>s[j]) {
					ic[i]=Math.max(ic[i], ic[j]+1);
				}
			}
		}
		
		//LDS
		for(int i=N-1;i>=0;i--){
			for(int j=N-1;j>i;j--) {
				if(s[i]>s[j]) { //뒤에서부터 증가하는 수를 계산하기 때문
					dc[i]=Math.max(dc[i], dc[j]+1);
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			//-1을 하는 이유: LIS와 LDS에서 중복카운트 했기 때문이다.
			result=Math.max(result, ic[i]+dc[i]-1);
		}
		System.out.println(result);
	}
}