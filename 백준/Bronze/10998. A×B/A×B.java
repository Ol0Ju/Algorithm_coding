import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n1=Integer.parseInt(st.nextToken());
		int n2=Integer.parseInt(st.nextToken());
		System.out.println(n1*n2);

	}

}
