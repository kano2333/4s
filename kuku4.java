package enshu2_2021;

public class kuku4 {
	public static void main(String[] args) {
		int x,y,v,w;
		y=1;
		while(y<16) {
			for(x=1;x<16;x++) {
				v=x*y;
				if(v<16) {
					System.out.print(" ");
					printHex(v);
					System.out.print(" ");
				}else {
					w=v/16;
					v=v%16;
					if(w<16) {
					printHex(w);
					
					}
					if(v<16) {
						
						printHex(v);
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			y++;
		}
	}
	public static void printHex(int v) {
		if(v<10)System.out.print(v);
		else    System.out.print((char)('a'+v-10));
	}
}