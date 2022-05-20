package kougi7;

public class UCoord {
	int x,y;
	UCoord(){
		x=y=0;
	}
	public void move(int dx,int dy) {
		x+=dx;
		y+=dy;
		System.out.println("move1");
	}
}
