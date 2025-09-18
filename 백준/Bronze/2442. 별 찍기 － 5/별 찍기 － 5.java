import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		int S=2*N-1;
		for(int k=0;k<S;k+=2) {
			for(int j=S-1;j>k;j-=2) {
				sb.append(" ");
			}
			for(int i=0;i<=k;i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}