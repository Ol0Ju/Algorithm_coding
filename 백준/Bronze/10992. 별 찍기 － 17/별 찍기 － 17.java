import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) { //4
			for(int j=N;j>i;j--) {
				sb.append(" ");
			}
			if(i==1) { //첫줄
				sb.append("*");
			}else if(i==N) { //마지막줄
				for(int j=0;j<2*N-1;j++) {
					sb.append("*");
				}
			}else {
				sb.append("*"); //왼쪽 별
				for(int j=0;j<2*i-3;j++) {
					sb.append(" ");
				}
				sb.append("*"); //오른쪽 별
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
