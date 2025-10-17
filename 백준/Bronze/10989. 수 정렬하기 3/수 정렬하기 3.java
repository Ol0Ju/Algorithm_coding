import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		int[] d=new int[N];
		
		for(int i=0;i<N;i++) {
			d[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(d);
		for(int i=0;i<N;i++) {
			sb.append(d[i]).append("\n");
		}
		System.out.println(sb);
	}	
}