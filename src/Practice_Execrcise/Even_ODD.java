package Practice_Execrcise;

import java.util.List;

public class Even_ODD {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=List.of(2,3,4,5,6,7,8,9);
		
		//Even Numbers
		//l.stream().filter(i-> i%2==0).forEach(System.out::println);
		//l.stream().filter(i-> i%2==0).forEach(i->System.out.println(i));
		//Odd Numbers
		//l.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
		//squre of even numbers
		//l.stream().filter(i-> i%2==0).map(i->i*i).forEach(i->System.out.println(i));
		//Odd Numbers
	    l.stream().filter(i->i%2!=0).map(i->i*i*i).forEach(i->System.out.println(i));

	}
	
	

}
