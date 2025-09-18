import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] S=new int[N];
		for(int i=0;i<N;i++) {
			S[i]=Integer.parseInt(br.readLine());
		}
		
		int num=1; //오름차순을 위해
		Boolean result=true;
		Stack<Integer> stack=new Stack<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<N;i++) {
			int su=S[i];
			if(su>=num) {
				while(su>=num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}else {
				int n=stack.pop();
				if(n>su) {
					System.out.println("NO");
					result=false;
					break;
				}
				sb.append("-\n");
			}
		}
		if(result) System.out.println(sb.toString());
	}
	
}