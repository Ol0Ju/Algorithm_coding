import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s=br.readLine();//문자열
		int N=Integer.parseInt(br.readLine());//명령수
		
		Stack<Character> left=new Stack<>();
		Stack<Character> right=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			left.add(s.charAt(i)); //abcd 세팅
		}
		
		for(int i=0;i<N;i++) {
			String cur=br.readLine();
			switch(cur.charAt(0)) {
				case 'L':
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
					break;
				case 'D':
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
					break;
				case 'B':
					if(!left.isEmpty()) {
						left.pop();
					}
					break;
				case 'P':
					left.push(cur.charAt(2));
					break;
			}
		}
		while(!left.isEmpty()){
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.close();
		br.close();
	}	
}