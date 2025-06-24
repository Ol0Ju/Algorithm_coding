import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		int[] S=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			S[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(S);
		int count=0,i=0,j=N-1;
		while(i<j) {
			if(S[i]+S[j]<M)i++;
			else if(S[i]+S[j]>M)j--;
			else {
				count++;i++;j--;
			}
		}
		System.out.println(count);
	}

}
