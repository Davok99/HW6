package shapes;

public class Rectangle {
private int height;
private int width;
public Rectangle (int getWidth,int getHeight){
	height = getHeight;
	width = getWidth;
}
public int getArea(){
	return height * width;
}
}