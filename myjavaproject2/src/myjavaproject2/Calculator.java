package myjavaproject2;

public class Calculator {
	
	public int generateSum(int start, int end) {
		
		int result = 0;
		
		for( int a = start;    a <= end;      a++  ){
			
			result+= a;
			
		}
		
		return result;
		
	}
	
}
