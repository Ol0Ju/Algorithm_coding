import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		
		char[] c=s.toCharArray();
		int[] n=new int[26];
		for(int i=0;i<s.length();i++) {
			if(c[i]>='a'&&c[i]<='z') {
				int re=(int)c[i]-97;
				n[re]++;
			}
		}
		for(int i=0;i<26;i++) {
			sb.append(n[i]).append(" ");
		}
		System.out.println(sb);
	}	
}