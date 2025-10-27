import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String s=br.readLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=97&&c<=122) {
				c+=13;
				if(c>122) {
					c-=26;
				}
			}else if(c>=65&&c<=90) {
				c+=13;
				if(c>90) {
					c-=26;
				}
			}
			sb.append(c);
		}
		System.out.println(sb);
	}	
}