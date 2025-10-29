import java.io.*;
import java.util.*;

public class Main {
	static int N,K;
	static int size;
	static int[] tree;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		//세그먼트 트리 크기 구하기
		size=1;
		while(size<N)	size<<=1; //거듭제곱(*2랑 같음)
		tree=new int[size*2];
		
		//재귀로 초기화
		init(1,1,size);
		
		sb.append("<");
		int idx=0;
		
		for(int i=0;i<N;i++) {
			int remain=N-i; //남은사람
			idx=(idx+K-1)%remain;
			int num=query(1,1,size,idx+1);
			update(1,1,size,num,0); //제거
			sb.append(num);
			if(i!=N-1)	sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}
	
	//업데이트(사람 제거)
	static void update(int node, int start, int end, int idx, int val) {
		//현재구간[start,end]에 우리가 갱신하려는 idx가 포함됐냐?
		if(idx<start || idx>end) return; 
		if(start==end) {
			tree[node]=val; //단일 노드일경우
			return;
		}
		int mid=(start+end)/2; //구간 반으로 나누기
		update(node*2,start,mid,idx,val); //왼족
		update(node*2+1,mid+1,end,idx,val);
		tree[node]=tree[node*2]+tree[node*2+1];	
	}

	// K번째 사람 찾기
	static int query(int node, int start, int end, int k) {
		if(start==end) return start; //단일 원소일 때
		int mid=(start+end)/2; //현재 구간 반으로 나눔
		if(tree[node*2]>=k) { //왼쪽 자식에 k번째 사람이 존재하는 경우
			return query(node*2,start,mid,k); 
		}else {
			//오른쪽 자식에 k번쨰 사람이 있는 경우
			//k에서 왼쪽 구간에 있는 사람수(tree[node*2]를 뺴고 전달
			return query(node*2+1,mid+1,end,k-tree[node*2]);
		}
	}
	
	static int init(int node, int start, int end) {
		if(start>N)	return tree[node]=0; //범위 밖은 0
		if(start==end) {
			return tree[node]=1; //사람 살아있음
		}
		int mid=(start+end)/2;
		int left=init(node*2,start,mid);
		int right=init(node*2+1,mid+1,end); //+1을 하는 이유 오른쪽 노드여서
		return tree[node]=left+right;
		
	}	
}