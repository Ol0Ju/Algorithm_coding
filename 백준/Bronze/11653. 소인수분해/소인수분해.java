import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		
		for(int i=2;i*i<=N;i++) {
			while(N%i==0) {
				sb.append(i).append("\n");
				N/=i;
			}
		}
		//마지막 남은 소수 출력
		if(N!=1) {
			sb.append(N).append("\n");
		}
		System.out.println(sb);
	}
}