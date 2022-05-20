package enshu2_2021;

public class kukue {
	public static void main(String args[]) {
		int z;
		z=1;
		while(z<3) {
			sub(z);
			System.out.println();
			z++;
		}
	}
	public static void sub(int y) {
		int x,i;
		y=1;
		while(y<10) {
			for(i=0;i<2;i++) {
				for(x=1;x<10;x++) {
					if(x*y<10) {
						System.out.print(" "+x*y+" ");
					}else {
						System.out.print(x*y+" ");
					}
				}
				System.out.print(" ");
			}
			System.out.println();
			y++;
		}
	}
}

