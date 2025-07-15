import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int m=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		
		String[] days= { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		for(int i=0;i<m-1;i++) {
			sum+=months[i];
		}
		sum+=d;
		System.out.println(days[sum%7]);
	}
}
