import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int count=1; //자기자신(N) 포함
		int start=1, end=1, sum=1;
		
		while(end!=N) {
			if(sum==N) {
				count++;end++;
				sum+=end;
			}else if(sum>N) {
				sum-=start;
				start++;
			}else {
				//sum<N
				end++;
				sum+=end;
			}
		}
		System.out.println(count);
	}

}