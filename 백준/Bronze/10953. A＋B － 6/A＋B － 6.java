import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			st=new StringTokenizer(str,",");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}

}
