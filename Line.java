package kougi10;

import java.awt.Graphics;

class Line extends Figure{
	Line(){}
	@Override public void paint(Graphics g) {
		g.drawLine(x,y,x+w,y+h);
	}
}
