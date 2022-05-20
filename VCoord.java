package kougi7;

public class VCoord {
	int x,y;
	VCoord(){
		x=y=0;
	}
	public void move(int dx,int dy) {
		x+=dx;
		y+=dy;
		System.out.println("move1");
	}
}
