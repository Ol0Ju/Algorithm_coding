import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[] c=br.readLine().toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
			if(i%10==9) {
				System.out.println();
			}
		}
	}

}