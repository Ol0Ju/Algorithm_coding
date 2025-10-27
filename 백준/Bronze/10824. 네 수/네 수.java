import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
		String[] s=new String[4];
		for(int i=0;i<4;i++) {
			s[i]=st.nextToken();
		}
		String s1=s[0]+s[1];
		String s2=s[2]+s[3];
		
		sb.append(Long.parseLong(s1)+Long.parseLong(s2));
		System.out.println(sb);
	}	
}