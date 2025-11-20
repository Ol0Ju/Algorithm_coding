import java.io.*;
import java.util.*;

public class Main {	
	static int P;
	
	static int getNext(int a) {
		int sum=0;
		while(a>0) {
			int digit=a%10;
			sum+=Math.pow(digit,P);
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken());
		P=Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(A);
		
		while(true) {
			int next=getNext(list.getLast());
			
			//next가 리스트에 있냐?
			if(list.contains(next)) {
				int idx=list.indexOf(next);
				System.out.println(idx);
				break;
			}
			list.add(next);
		}
	}
	
}