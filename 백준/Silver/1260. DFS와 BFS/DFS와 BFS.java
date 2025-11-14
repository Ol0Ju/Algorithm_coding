import java.io.*;
import java.util.*;

public class Main {	
	static int node,line,start;
	static ArrayList<Integer>[] A; //데이터 저장 인접리스트
	static boolean[] visited;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		node=Integer.parseInt(st.nextToken()); 
		line=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());
		
		A=new ArrayList[node+1];
		visited=new boolean[node+1];
		
		//인접리스트 초기화
		for(int i=1;i<=node;i++) {
			A[i]=new ArrayList<>();
		}
		
		//그래프 입력 (무방향)
		for(int i=0;i<line;i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken()); //시작
			int e=Integer.parseInt(st.nextToken()); //끝
			A[s].add(e); //양쪽방향으로 더해줘야됨 방향이 없기 때문에
			A[e].add(s);
		}
		
		 // 정렬 필수 (번호 작은 노드 방문하게)
        for (int i = 1; i <= node; i++) {
            Collections.sort(A[i]);
        }
        	
		DFS(start);
		sb.append("\n");
		
		visited=new boolean[node+1];
		BFS(start);
		
		System.out.println(sb);
	}
	
	private static void BFS(int v) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(v);
		visited[v]=true;
		
		while(!queue.isEmpty()) {
			int cur=queue.poll();
			sb.append(cur).append(" ");
			
			for(int i=0;i<A[cur].size();i++) {
				int next=A[cur].get(i);
				
				if(!visited[next]) {
					visited[next]=true;
					queue.add(next);
				}
			}
		}
	}
	
	private static void DFS(int v) {
		visited[v]=true;
		sb.append(v).append(" ");
		for(int i=0;i<A[v].size();i++) {
			int next=A[v].get(i);
			if(!visited[next]) {
				DFS(next);
			}
			
		}
	}
}