package assignment;



//This is main class to test code
public class TestMyCircle {
	public static void main(String[] args){
		MyCircle c1 = new MyCircle();
		System.out.println(c1);
		MyCircle c2 = new MyCircle(2,3,6);
		System.out.println(c2);
		
		//After change the value
		c1=c2;
		c2.setX(4);
		c2.setY(6);
		c2.setRadius(12);
		
		System.out.println("\n After change the value.And c1=c2");
		System.out.println(c1);
		System.out.println(c2);
		
		//after getBiggerCircleRef
		MyCircle c3 = MyCircle.getBiggerCircleRef(c1, c2);
		System.out.println("\n After getBiggerCircleRef");
		System.out.println(c3);
		c2.setX(7);
		c2.setY(13);
		c2.setRadius(17);
		//c2&c3 are pointing same object
		System.out.println("\nMake sure c2&c3 are pointing same object");
		System.out.println(c3);
		System.out.println(c2);
		
		
		//clone
		MyCircle c4 = MyCircle.getBiggerCircleClone(c1, c2);
		System.out.println("\nclone");
		System.out.println(c4);
		c2.setX(10);
		c2.setY(15);
		c2.setRadius(20);
		System.out.println("\n Make sure keep the clone's value");
		System.out.println(c2);
		System.out.println(c4);
	}

}

class MyCircle{
	private int x;
	private int y;
	private int radius;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//constructor
	public MyCircle() {
		x=0;
		y=0;
		radius=0;
	}
	
	//override constructor
	public MyCircle(int centerX,int centerY,int rad){
		x=centerX;
		y=centerY;
		radius=rad;
	}
	
	public String toString(){
		return (" Circle @ ("+x+", "+y+") radius="+radius+".");
	}
	
	public double getArea(){
		double area = radius*2*3.14;
		return area;
	}
	
	static public MyCircle getBiggerCircleRef(MyCircle c1,MyCircle c2){
		if(c1.getArea() >= c2.getArea()){
			return c1;
		}
		else{
			return c2;
		}
	}
	
	static public MyCircle getBiggerCircleClone(MyCircle c1,MyCircle c2){
		MyCircle cir = new MyCircle();
		MyCircle c = getBiggerCircleRef(c1, c2);
		cir.x=c.x;
		cir.y=c.y;
		cir.radius=c.radius;
		return cir;
	}
}


