package kougi5;

public class kuku {
	public static void main(String[] args) {
		int y;
		y=1;
		
		System.out.print("    ");
		for(int x=1;x<10;x++) {
			System.out.print(" "+x+" ");
		}
		System.out.println();
		
		for(int x=0;x<9*3+4;x++) {
			System.out.print("-");
		}
		System.out.println();
		
		while(y<10) {
			System.out.print(y+"  |");
			for(int x=1;x<10;x++) {
				if(x>=y) {
					if(x*y<10) {
						System.out.print(" "+x*y+" ");
					}else {
						System.out.print(x*y+" ");
					}
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
			y++;
		}
	}
}
