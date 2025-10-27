import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		String[] s1=new String[s.length()];
		for(int i=0;i<s.length();i++) {
			s1[i]=s.substring(i,s.length());
		}
		Arrays.sort(s1);
		for(int i=0;i<s1.length;i++) {
			sb.append(s1[i]).append("\n");
		}
		System.out.println(sb);
	}	
}