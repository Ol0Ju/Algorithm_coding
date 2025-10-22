//스택 X
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		int count=0;
		int open=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				open++;
			}else {
				open--;
				if(s.charAt(i-1)=='(') {
					count+=open;
				}
				else {
					count++;
				}
			}
		}
		System.out.println(count);
	}	
}