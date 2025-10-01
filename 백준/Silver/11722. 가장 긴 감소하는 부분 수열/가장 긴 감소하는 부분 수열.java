import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] s=new int[N]; //입력받을 배열
		int[] d=new int[N];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			s[i]=Integer.parseInt(st.nextToken());
            d[i]=1;
		}
		
		int result=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(s[i]<s[j]) {
					d[i]=Math.max(d[i], d[j]+1);
				}
			}
			result=Math.max(d[i],result);
		}
		System.out.println(result);
	}	
}