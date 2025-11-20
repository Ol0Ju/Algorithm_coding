import java.io.*;
import java.util.*;

public class Main {	
	static LinkedList<Integer>[] graph;
	static boolean[] visited;
	static int count=0;
	
	static void DFS(int node) {
		visited[node]=true;
		
		/*
		 for (int next : graph[node]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
		*/
		for(int i=0;i<graph[node].size();i++) {
			int next=graph[node].get(i);
			if(!visited[next]) {
				count++;
				DFS(next);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine()); //컴퓨터 수
		int m=Integer.parseInt(br.readLine());
		
		graph=new LinkedList[n+1];
		visited=new boolean[n+1];
		
		// 각 리스트 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new LinkedList<>();
        }
		
		for(int i=0;i<m;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			//양방향 연결
			graph[a].add(b);
			graph[b].add(a);
		}
		DFS(1);
			
		System.out.println(count);
	}
}