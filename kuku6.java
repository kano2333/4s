package enshu2_2021;

public class kuku6 {
	public static void main(String[] args) {
		System.out.print("     ");
		int i;
		for(i=1;i<16;i++) {
			printHex2(i,3);
			System.out.print(" ");
			
		}
		System.out.println(" ");
		System.out.println("----------------------------------------------------------------");
		
		int x,y,v,w;
		y=1;
		while(y<16) {
			printHex2(y,3);
			System.out.print(" |");
			for(x=1;x<16;x++) {
				v=x*y;
				printHex2(v,3);
				System.out.print(" ");
				
			}
			System.out.println();
			y++;
		}
	}
	public static void printHex(int v) {
		if(v<10)System.out.print(v);
		else    System.out.print((char)('A'+v-10));
	}
	public static void printHex2(int v) {
		int w;
		w=v/16;
		if(w!=0)printHex(w);
		else    System.out.print(0);
		
		printHex(v%16);
		System.out.print(" ");
	}
	public static void printHex2(int v,int n) {
		int i, x=1, w;
	
		for(i=1;i<n;i++) x=x*16;
		for(i=0;i<n;i++) {
			w=v/x;
			v=v%x;
			printHex(w);
			x=x/16;
		}
		
	}
	
}

