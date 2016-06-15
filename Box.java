class Box {
    private double breite;
    private double hoehe;
    private double tiefe;

    public Box(double breite, double hoehe,
	       double tiefe){

	this.breite = breite;
	this.hoehe = hoehe;
	this.tiefe = tiefe;

    }

    public double getHeight(){

	return hoehe;
    }

    
    public double getWidth(){

	return breite;
    }
    
    public double getDepth(){

	return tiefe;
    }

    public double getVolumeSize(){
	return hoehe*breite*tiefe;
    }

    public double getEdgesLength (){
	return 4*hoehe+4*breite+4*tiefe;
    }

    public boolean isCube(){
	return (hoehe == breite && breite == tiefe);
    }

    public int compareTo(Box f){
	if(getVolumeSize() > f.getVolumeSize())
	    return 1;
	if(getVolumeSize() == f.getVolumeSize())
	    return 0;
	
	return -1;

	

    }

    public boolean encloses(Box f){

	double a[] = new double[3];
	double b[] = new double[3];
	a[0] = hoehe;
	a[1] = breite;
	a[2] = tiefe;
	b[0] =f.getHeight();
	b[1] = f.getWidth();
	b[2] = f.getDepth();

	java.util.Arrays.sort(a);
	java.util.Arrays.sort(b);

	

	if(a[0] > b[0] && a[1] > b[1] && a[2] > b[2])
	    return true;

	return false;
    }

	


}

    
