import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		
		//나이범위 1~200
		StringBuilder[] p=new StringBuilder[201];
		
		for(int i=0;i<p.length;i++) {
			p[i]=new StringBuilder(); //전부 빈 문자열로 초기화
		}
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int age=Integer.parseInt(st.nextToken());
			String nm=st.nextToken();
			p[age].append(age+" "+nm).append("\n");
		}
		
		for(StringBuilder val:p) {
			sb.append(val);
		}
		System.out.println(sb);
	}	
}