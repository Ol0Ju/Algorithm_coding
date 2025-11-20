//DFS
import java.io.*;
import java.util.*;

public class Main {	
	static int P;
	static int[] visited=new int[300000];
	static int answer=0;
	
	static int getNext(int a) {
		int sum=0;
		while(a>0) {
			int digit=a%10;
			sum+=Math.pow(digit,P);
			a/=10;
		}
		return sum;
	}
	
	static void DFS(int a, int depth) {
		if(visited[a]!=0) {
			answer=visited[a]-1;
			return;
		}
		
		visited[a]=depth;
		
		int next=getNext(a);
		DFS(next,depth+1);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int A=Integer.parseInt(st.nextToken());
		P=Integer.parseInt(st.nextToken());
		
		DFS(A,1);
		
		System.out.println(answer);
	}
}