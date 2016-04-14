
class Rectangle {
    private double width;
    private double height;


    public Rectangle(double width, double height){
	this.width = width;
	this.height = height;
    }


    public void Print(){
	for(int i = 0; i < width; i++){
	    System.out.print("_");
	}
	System.out.print("\n");
	for(int n = 0; n < height; n++){
	    System.out.print("|");
	    for(int m = 0; m < width-2; m++){
       		    System.out.print(" ");
	    }
	    System.out.println("|");
	}
	for(int i = 0; i < width; i++){
	    System.out.print("-");
	}
    }
}
