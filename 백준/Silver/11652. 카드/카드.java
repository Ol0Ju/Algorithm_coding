import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()); //몇 개 받을건지
		long[] arr=new long[N];
		for(int i=0;i<N;i++) {
			arr[i]=Long.parseLong(br.readLine()); //배열 저장
		}
		
		//왜 정렬하냐?
		//정렬을 하면 같은 숫자들이 연속으로 모이기 때문에, 한 번만 순회하면서 빈도를 셀 수 있다.
		Arrays.sort(arr);
		
		long max=arr[0];
		int m_cnt=1;
		
		long cur=arr[0]; //현재
		int c_cnt=1;
		
		for(int i=1;i<N;i++) {
			if(arr[i]==cur) {
				c_cnt++;
			}
			else {
				if(c_cnt>m_cnt) {
					m_cnt=c_cnt;
					max=cur;
				}
				//새로운 카드로 변경
				cur=arr[i];
				c_cnt=1;
			}
		}
		if(c_cnt>m_cnt) {
			max=cur;
		}
		System.out.println(max);
	}
}