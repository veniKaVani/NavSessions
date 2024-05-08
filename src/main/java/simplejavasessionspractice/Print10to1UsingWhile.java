package simplejavasessionspractice;

public class Print10to1UsingWhile {

	public static void main(String[] args) {
		int i = 10;
		while(!(i<=0)) {
			System.out.println(i);
			i--;
		}
		System.out.println("-----------------");
		//using for loop printing 10 to 1
		
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		System.out.println("-----------------");
		//print even and odd nos
		for(int num=1;num<=10;num++) {
			if(num%2==0) {
				System.out.println("num is even: "+num);
			}else {
				System.out.println("num is odd: "+num);
			}
		}

	}

}
