import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine()); //몇 개 받을건지
		int[] s=new int[N]; //입력받는 배열
		int[] d=new int[N];

		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
			d[i]=1; //1로 초기화
		}
		
		int answer=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(s[i]>s[j]) {
					d[i]=Math.max(d[i], d[j]+1);
				}
			}
			answer=Math.max(answer, d[i]);
		}
		System.out.println(answer);
	}	
}