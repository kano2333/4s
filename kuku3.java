package enshu2_2021;

public class kuku3 {
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
		int x,i,n;
		y=1;
		while(y<10) {
			for(i=0;i<2;i++) {
				for(x=1;x<10;x++) {
					n=x*y;
					print(n);
				}
				System.out.print(" ");
			}
			System.out.println();
			y++;
		}
	}
	public static void print(int n) {
		if(n<10) {
			System.out.print("0"+n+" ");
		}else {
			System.out.print(n+" ");
		}
	}
}