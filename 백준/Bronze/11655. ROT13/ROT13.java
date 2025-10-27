import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				c+=13;
				if(c>'z') {
					c-=26;
				}
			}else if(c>='A'&&c<='Z') {
				c+=13;
				if(c>'Z') {
					c-=26;
				}
			}
			sb.append(c);
		}
		System.out.println(sb);
	}	
}