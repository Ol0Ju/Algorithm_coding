import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] t=new int[N+1];
		
        if (N % 2 != 0) { 
            System.out.println(0); 
            return; 
         }
        
		t[0]=1; //아무것도 없을 때 1이라고 초기화
		t[2]=3;
		for(int i=4;i<=N;i+=2) {
			t[i]=t[i-2]*3;
			for(int j=i-4;j>=0;j-=2) {
				t[i]+=t[j]*2;
			}
		}
		System.out.println(t[N]);		
	}
}