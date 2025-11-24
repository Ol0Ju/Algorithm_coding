import java.io.*;
import java.util.*;

public class Main {	
	static ArrayList<Integer>[] graph;
	static int[] visited;
	static int order=1;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken()); //정점 수
		int M=Integer.parseInt(st.nextToken()); //간선 수
		int R=Integer.parseInt(st.nextToken()); //시작정점
		
		graph=new ArrayList[N+1];
		visited=new int[N+1];
		
		for(int i=1;i<=N;i++) {
			graph[i]=new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());;
			int b=Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		
		for(int i=1;i<=N;i++) {
			Collections.sort(graph[i]);
		}
		
		dfs(R);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb);
	}

	static void dfs(int node) {
		visited[node]=order++;
		
		for(int next:graph[node]) {
			if(visited[next]==0) {
				dfs(next);
			}
		}
		
	}
}