package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	int w, h;
	Point center;
	
	public Rectangle(Point center,int w, int h){
		this.w=w;
		this.h=h;
		this.center=center;
	}
    public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}
	public int getHeight(){
		return h;
	}
	public int getWidth(){
		return w;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}