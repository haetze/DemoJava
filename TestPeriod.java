class TestPeriod {

    public static void main(String argv[]){

	Period p = new Period(-100);
	System.out.println(p.getMinutes());

	p.change(100);
	System.out.println(p.toString());

	System.out.println(p.getHours());
	System.out.println(p.getMinorMinutes());
    }
    
}
