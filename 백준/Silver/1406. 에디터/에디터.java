import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s=br.readLine();//문자열
		int N=Integer.parseInt(br.readLine());//명령수
		
		Deque<Character> left=new ArrayDeque<>();
		Deque<Character> right=new ArrayDeque<>();
		
		for(char c:s.toCharArray()) {
			left.addLast(c);
		}
		
		for(int i=0;i<N;i++) {
			String cur=br.readLine();
			switch(cur.charAt(0)) {
				case 'L':
					if(!left.isEmpty()) {
						right.addFirst(left.removeLast());
					}
					break;
				case 'D':
					if(!right.isEmpty()) {
						left.addLast(right.removeFirst());
					}
					break;
				case 'B':
					if(!left.isEmpty()) {
						left.removeLast();
					}
					break;
				case 'P':
					left.addLast(cur.charAt(2));
					break;
			}
		}
		while(!left.isEmpty()){
			bw.write(left.removeFirst());;
		}
		while(!right.isEmpty()) {
			bw.write(right.removeFirst());
		}
		bw.flush();
		bw.close();
	}	
}