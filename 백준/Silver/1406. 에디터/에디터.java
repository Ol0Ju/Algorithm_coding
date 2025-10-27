import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		String s=br.readLine();//문자열
		int N=Integer.parseInt(br.readLine());//명령수
		
		LinkedList<Character> list=new LinkedList<>();
		
		for(char c:s.toCharArray()) {
			list.add(c);
		}
		
		ListIterator<Character> cursor=list.listIterator(list.size());
		
		while(N-->0) {
			String cur=br.readLine();
			switch(cur.charAt(0)) {
				case 'L':
					if(cursor.hasPrevious()) {
						cursor.previous();
					}
					break;
				case 'D':
					if(cursor.hasNext()) {
						cursor.next();
					}
					break;
				case 'B':
					if(cursor.hasPrevious()) {
                        cursor.previous();
						cursor.remove();
					}
					break;
				case 'P':
					cursor.add(cur.charAt(2));
					break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char ch:list)	sb.append(ch);
		System.out.println(sb);
	}	
}