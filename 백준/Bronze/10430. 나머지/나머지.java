import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		
		int re=0;
		re=(A+B)%C;
		sb.append(re).append("\n");
		re=((A+C)+(B%C))%C;
		sb.append(re).append("\n");
		re=(A*B)%C;
		sb.append(re).append("\n");
		re=((A%C)*(B%C))%C;
		sb.append(re);
		System.out.println(sb);
	}
}