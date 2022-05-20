package kougi6;
public class RCoord{
	int x,y;
	RCoord(){
		x=y=0;
	}
	public void move(int dx,int dy) {
		x += dx;
		y += dy;
	}
	public void moveto(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

class Circle extends RCoord{
	int color,size;
	Circle(){
		color=0;
		size=1;
	}
}