import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<N;i++) {//0-5까지
			for(int j=0;j<i+1;j++) {
				sb.append("*");//*
			}
			for(int j=2*N-1;j>2*i+1;j--){
				sb.append(" ");
			}
			for(int j=0;j<i+1;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i=N-1;i>0;i--) {//4 3 2 1
			for(int j=i;j>0;j--) {
				sb.append("*");//*
			}
			for(int j=i*2-1;j<2*N-1;j++){
				sb.append(" ");
			}
			for(int j=i;j>0;j--) {
				sb.append("*");
			}
			sb.append("\n");
		}		
		System.out.println(sb.toString());
	}
}
