import java.io.*;
import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int kor,eng,mat;

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//다중 기준 정렬
	@Override
	public int compareTo(Student s) {
		if(this.kor!=s.kor)
			return s.kor-this.kor; //국어 내림차순
		if(this.eng!=s.eng)
			return this.eng-s.eng;
		if(this.mat!=s.mat)
			return s.mat-this.mat;
		return this.name.compareTo(s.name); //이름 오름차순
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int N=Integer.parseInt(br.readLine());
		
		List<Student> list=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			int kor=Integer.parseInt(st.nextToken());
			int eng=Integer.parseInt(st.nextToken());
			int mat=Integer.parseInt(st.nextToken());
			
			list.add(new Student(name,kor,eng,mat));
		}
		//정렬
		Collections.sort(list);
		
		StringBuilder sb=new StringBuilder();
		for(Student s:list) {
			sb.append(s.name).append("\n");
		}
		System.out.println(sb);
	}	
}