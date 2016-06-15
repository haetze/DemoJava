class PointInTime{
    private int year;
    private int day;
    private int hour;

    public PointInTime(int y, int d, int h){
	if((y > 999 && y < 10000) &&
	   (d >= 1 && d <= 365) &&
	   (h >= 0 && h <= 23)){
	    year = y;
	    day  = d;
	    hour = h;
	}else{
	    //throw new InvalidStateException();
	}
    }

    public int getHour(){
	return hour;
    }

    public int getYear(){
	return year;
    }
    public int getDay(){
	return day;
    }

    public String toString(){
	String d = day+"";
	String y = year+"";
	String h = hour+"";

	if(d.length() < 2){
	    d = "00"+d;
	}
	if(d.length() < 3){
	    d = "0"+d;
	}
	if(h.length() < 2){
	    h = "0"+h;
	}

	return year+"/"+d+"/"+h;
    }

    public void change(int h){
	if(h < 0)
	    return;

	hour += h;
	if(hour <= 23)
	    return;
	day += hour/24;
	hour = hour % 24;
	if(day <= 365)
	    return;
	year += day/366;
	day = day % 365;

	if(year > 10000){
	    //Error handling
	}
    }
	

}
