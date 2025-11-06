import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine(); //8진수 input
		
		String[] map= {
				"000","001","010","011",
				"100","101","110","111"
		};
		
		int first=s.charAt(0)-'0';
		sb.append(Integer.parseInt(map[first])); //앞 0 제거
		
		for(int i=1;i<s.length();i++) {
			sb.append(map[s.charAt(i)-'0']);
		}
		System.out.println(sb);
	}
}