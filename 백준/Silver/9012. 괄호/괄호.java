import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String s=br.readLine();
			int count=0;
			boolean valid=true;
			for(char c:s.toCharArray()) {
				if(c=='(') count++;
				else if(c==')') count--;
				
				if(count<0) { //닫는 괄호가 먼저 나오면 안됨
					valid=false;
					break;
				}
			}
			if(count!=0) valid=false; //여는 괄호가 남은경우
			sb.append(valid?"YES":"NO").append("\n");
		}
		System.out.println(sb);	
	}	
}