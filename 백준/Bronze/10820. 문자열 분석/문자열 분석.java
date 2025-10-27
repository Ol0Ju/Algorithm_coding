import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s;
		
		while((s=br.readLine())!=null) {
			int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
					cnt1++;
				}else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
					cnt2++;
				}else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
					cnt3++;
				}else if(s.charAt(i)==' ') {
					cnt4++;
				}	
			}
			sb.append(cnt1).append(" ").append(cnt2).append(" ")
			.append(cnt3).append(" ").append(cnt4).append("\n");
		}
		System.out.println(sb);
	}	
}