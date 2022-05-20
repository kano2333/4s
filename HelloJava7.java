package enshu2_2021;

public class HelloJava7 {
	public static void main(String args[]) {
		System.out.print("     ");
		int i;
		for(i=1;i<10;i++) {
			System.out.print(String.format("%2d",i));
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("-------------------------------");
		
		int j;
		int k;
		for(j=1;j<10;j++) {
			System.out.print(String.format("%2d",j));
			System.out.print(" |");
				for(i=1;i<10;i++) {
					if(i>=j) {
						k=i*j;
						System.out.print(" ");
						System.out.print(String.format("%2d",k));	
					}
					else {
						System.out.print("   ");
					}
				}
			System.out.println(" ");
		}
	}

}
