import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//백준 1546
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long sum=0;
		long max=0;
		
		for(int i=0;i<N;i++) {
			int temp=sc.nextInt();
			if(max<temp) {
				max=temp;
			}
			sum+=temp;
		}
		System.out.println(sum*100.0/max/N);
	}

}
