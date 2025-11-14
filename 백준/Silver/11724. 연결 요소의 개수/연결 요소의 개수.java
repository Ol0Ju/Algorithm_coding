import java.io.*;
import java.util.*;

public class Main {	
	static ArrayList<Integer>[] A; //데이터 저장 인접리스트
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()); //정점개수
		int m=Integer.parseInt(st.nextToken()); //간선개수
		
		A=new ArrayList[n+1];
		visited=new boolean[n+1];
		
		//초기화
		for(int i=1;i<=n;i++) {
			A[i]=new ArrayList<Integer>();
		}
		
		//m번 반복
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken()); //시작
			int e=Integer.parseInt(st.nextToken()); //끝
			A[s].add(e); //양쪽방향으로 더해줘야됨 방향이 없기 때문에
			A[e].add(s);
		}
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	private static void DFS(int v) {
		if(visited[v])	return;
		visited[v]=true;
		for(int i:A[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}	
	}
}