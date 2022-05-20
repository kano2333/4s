package kougi10;

import java.awt.Graphics;

class Figure extends Coord{
	int color;
	int w,h;
	Figure(){
		color=0;
		w=h=0;
	}
	public void paint(Graphics g) {}
	public void setWH(int w,int h) {
		this.w=w;
		this.h=h;
	}
}