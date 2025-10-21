import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()); //몇 개
		int K=Integer.parseInt(st.nextToken()); //몇 번째
		int[] arr=new int[N];
		
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st2.nextToken());
		}
        Arrays.sort(arr);
		System.out.println(arr[K-1]);
	}
}