package Practice_Execrcise;

import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=List.of(2,3,2,12,4,5,6,7,8,9,15);
		
		//sum of all numbers
		int sum=l.stream().reduce(0,(x,y)->x+y);
		System.out.println(sum);
		
		int max=l.stream().reduce(0,(x,y)->x>y?x:y);
		System.out.println(max);
		
		int min=l.stream().reduce(2,(x,y)->x>y?y:x);
		System.out.println(min);
	

	}

}
