import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] s=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
		}
		//10 -4 3 1 5 6 -35 12 21 -1
		int[] d=new int[N];
		d[0]=s[0]; //10
		int result=s[0]; //10
		
		for(int i=1;i<N;i++) {
			//i=1, -4,10+(-4) 4와 6 d[1]=6
			d[i]=Math.max(s[i], d[i-1]+s[i]); 
			//10, 6 result=10
			result=Math.max(result, d[i]);
		}
		System.out.println(result);
	}	
}