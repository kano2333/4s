package kougi7;

import java.util.ArrayList;

public class VCircleTest2 {
	public static void main(String[] args) {
		ArrayList<VCoord> objList=new ArrayList<VCoord>();
		VCoord c=new VCircle();
		objList.add(c);
		c.move(100,100);
		System.out.println("x = "+c.x+" y = "+c.y);
	}
}
