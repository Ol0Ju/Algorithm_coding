import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int k=0;k<N;k++) {
			for(int j=0;j<k;j++) {
				sb.append(" ");
			}
			for(int i=N;i>k;i--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}