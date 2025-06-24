import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int[] S=new int[T];
		
		for(int i=0;i<T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			S[i]=A+B;
		}
		for(int i=0;i<T;i++) {
			System.out.println(S[i]);
		}

	}

}