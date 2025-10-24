import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		
		int[] n=new int[26];
		for(int i=0;i<26;i++) {
			n[i]=-1;
		}
		for(int i=0;i<s.length();i++) {
			int re=s.charAt(i)-'a';
			if(n[re]==-1) {
				n[re]=i;
			}
		}
		for(int i=0;i<26;i++) {
			sb.append(n[i]).append(" ");
		}
		System.out.println(sb);
	}	
}