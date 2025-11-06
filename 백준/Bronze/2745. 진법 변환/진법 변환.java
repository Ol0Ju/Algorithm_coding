import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String s=st.nextToken();
		int B=Integer.parseInt(st.nextToken());
		
		int tmp=1;
		int res=0;
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') {
				res+=(c-55)*tmp;
			}else {
				res+=(c-48)*tmp; //0 뺴는 거
			}
			tmp*=B;
		}
		System.out.println(res);
	}
}