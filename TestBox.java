class TestBox{

    public static void main(String argv[]){

	Box a = new Box(32,20,10);
	Box b = new Box(11,21,40);

	System.out.println(b.encloses(a));

    }
}
