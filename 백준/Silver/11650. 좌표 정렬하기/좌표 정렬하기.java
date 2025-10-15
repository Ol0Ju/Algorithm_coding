import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		int[][] a=new int[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				a[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(a,(o1,o2)->{
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}else {
				return o1[0]-o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			sb.append(a[i][0]).append(" ").append(a[i][1]).append("\n");
		}
		System.out.println(sb);
	}	
}