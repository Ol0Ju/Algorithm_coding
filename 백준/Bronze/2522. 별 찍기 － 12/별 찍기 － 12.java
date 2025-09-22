import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<N;i++) { 
			for(int j=N-1;j>i;j--) { 
				bw.write(" ");
			}
			for(int j=0;j<i+1;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<i+1;j++) {
				bw.write(" ");
			}
			for(int j=N-1;j>i;j--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
		bf.close();
	}
}
