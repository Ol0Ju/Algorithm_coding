import java.io.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n1=Integer.parseInt(st.nextToken());
		int n2=Integer.parseInt(st.nextToken());
		LocalDate date=LocalDate.of(2007, n1, n2);
		DayOfWeek dow=date.getDayOfWeek();
		String day=dow.getDisplayName(TextStyle.SHORT,Locale.US);
		System.out.println(day.toUpperCase());
	}
}
