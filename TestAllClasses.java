class TestAllClasses{

    public static void main(String argv[]){

	Period p1 = new Period(120);
	PointInTime p2 = new PointInTime(1997, 11, 2);
	Date d = new Date("Richard's Geb", p2, p1);

	System.out.println(d.toString());
    }
}
