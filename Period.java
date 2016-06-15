class Period{

    private int minutes;

    public Period(int m){
	minutes = 0;
	if(m > 0)
	    minutes = m;
    }
    public Period(int h, int m){
	minutes = 0;
	if(h > 0 && m > 0)
	    minutes = 60*h + m;
    }
    public int getHours(){
	return minutes/60;
    }
    public int getMinorMinutes(){
	return minutes%60;
    }
    public int getMinutes(){
	return minutes;
    }
    public String toString(){
	int h = getHours();
	int m = getMinorMinutes();

	if(h < 10 && m < 10)
	    return "0"+h+":0"+m;
	if(h < 10 && !(m < 10))
	    return "0"+h+":"+m;
	if(h >= 10 && m < 10)
	    return h+":0"+m;

	return h+":"+m;

    }


    public Period clone(){

	return new Period(getMinutes());
    }

    public void change(int m){
	if(m < 0)
	    return;

	minutes += m;
}
    }
	
