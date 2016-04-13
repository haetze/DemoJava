import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class test{
	public static void main(String[] args){
	    Rectangle rect;
	    rect = new Rectangle(Integer.parseInt(args[0]),
				 Integer.parseInt(args[1]));
	    System.out.println(rect.Area());
	    rect.Print();
	    System.out.println();
	}
}

//simple example class
class Rectangle {
    //state
    private int height;
    private int width;
    //constructor
    public Rectangle(int h, int w){
	height = h;
	width  = w;
    }

    //method
    public int Area(){
	return height*width;
    }
    //method
    public void Print(){
	for(int i = 0; i < width; i++)
	    System.out.print("_");
	System.out.println();
	for(int n = 0; n < height; n++){
	    System.out.print("|");
	    for(int k = 0; k < width-2; k++)
		System.out.print(" ");
	    System.out.print("|");
	    System.out.println();
	}

	for(int m = 0; m < width; m++)
	    System.out.print("-");
    }
}


