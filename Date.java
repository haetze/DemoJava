class Date{

    private String name;
    private PointInTime point;
    private Period period;

    public Date(String n, PointInTime p1, Period p2){
	name = n;
	point = p1;
	period = p2;
    }

    public void change(int h, int m){
	point.change(h);
	period.change(m);
    }

    public String toString(){
	return name+" at "+point.toString()+" for "+period.toString()+
	    "hours";
    }
}
