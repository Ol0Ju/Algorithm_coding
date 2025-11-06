import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine(); //2진수 input
		
		while(s.length()%3!=0) {
			s="0"+s;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i+=3) {
			int val=(s.charAt(i)-'0')*4+
					(s.charAt(i+1)-'0')*2+
					(s.charAt(i+2)-'0');
			sb.append(val);
		}
		System.out.println(sb);
	}
}