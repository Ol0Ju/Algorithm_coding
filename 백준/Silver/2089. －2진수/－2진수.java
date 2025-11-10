import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		
		if(n==0) {
			System.out.println(0);
		}else {
			while(n!=0) {
				int r=n%-2;
				n/=-2;
				if(r<0) {
					r+=2;
					n+=1;
				}
				sb.append(r);
			}
			System.out.println(sb.reverse());	
		}
	}
}