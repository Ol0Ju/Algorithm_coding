import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int j=0;j<N;j++) {
			for(int i=N;i>j;i--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}