package Practice_Execrcise;

import java.util.List;

public class courses_individually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=List.of("Spring","Spring Boot","API","Java",".Net","Selenium","Docker");
		
	//	ls.stream().forEach(s->System.out.println(s));// Print all courses individually
	//	ls.stream().filter(s->s.contains("Spring")).forEach(s->System.out.println(s));// print the courses which contains Spring
		//ls.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));// courses more than 4 words
		ls.stream().map(s->s +": "+s.length()).forEach(s->System.out.println(s));

	}

}
