import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=s.length();
		int mod=1000000;
		long[] d=new long[n+1]; //경우의 수
		
		d[0]=1; //아무것도 해석하지 않은 경우 초기값 1
		
		if(s.charAt(0)=='0') {
			System.out.println(0); //첫번째 문제가 '0'이면 해석 불가능
			return;
		}
		
		d[1]=1; //첫 문자가 0이 아니므로 1가지 방법 존재
		for(int i=2;i<=n;i++) {
			int one=(s.charAt(i-1)-'0');
			int two=(s.charAt(i-2)-'0')*10+one;
			
			//한자리수
			if(one>=1&&one<=9) {
				d[i]+=d[i-1];
				d[i]%=mod;
			}
			//두자리수
			if(two>=10&&two<=26) {
				d[i]+=d[i-2];
				d[i]%=mod;
			}
		}
		System.out.println(d[n]);
	}
}