import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String[][] s=new String[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			s[i][0]=st.nextToken();
			s[i][1]=st.nextToken();
		}
		Arrays.sort(s,(s1,s2)->{
			return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
		});

		for(int i=0;i<N;i++) {
			sb.append(s[i][0]+" "+s[i][1]).append("\n");
		}
		System.out.println(sb);
	}	
}