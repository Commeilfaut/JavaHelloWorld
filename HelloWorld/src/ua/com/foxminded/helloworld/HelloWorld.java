package ua.com.foxminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		float i = 6;
		
		float j = 7;
				
		float answer = j / i;		
		
		
		
		String message = "Hello World";
		
		String StringAnswer = message + " " + answer;
		
		boolean isMoreThanOne;
		
		if(answer > 1) {
			isMoreThanOne = true;
		}else {
			isMoreThanOne = false;
		}
		
		System.out.println(message);
		
		System.out.println(StringAnswer + " " + isMoreThanOne );
		
		System.out.println(answer);
	}

}
