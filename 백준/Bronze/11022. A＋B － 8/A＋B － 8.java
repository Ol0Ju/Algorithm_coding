import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(r.readLine());
		for(int i=1;i<=T;i++) {
			String[] line=r.readLine().split(" ");
			int A=Integer.parseInt(line[0]);
			int B=Integer.parseInt(line[1]);
			sb.append("Case #").append(i).append(": ").append(A).append(" + ")
			.append(B).append(" = ").append(A+B).append("\n");
			}
		System.out.println(sb);
	}
}