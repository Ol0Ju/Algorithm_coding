import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		while(N>0) {
			int rem=N%B;
			if(rem>=10) {
				sb.append((char)(rem+=55));
			}else {
				sb.append(rem);
			}
			N/=B;
		}
		System.out.println(sb.reverse()); //변환한 문자는 뒤에서부터 쌓여서 .reverser() 필요
	}
}