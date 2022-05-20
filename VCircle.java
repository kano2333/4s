package kougi7;

public class VCircle extends VCoord{
	int color,size;
	VCircle(){
		color=0;
		size=10;
	}
	@Override public void move(int dx,int dy) {
		x-=dx;
		y-=dy;
		System.out.println("move2");
	}
	public void setSize(int s) {
		size=s;
	}
}