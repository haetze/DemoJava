//Richard Stewing
//<20.04.2016>

//Grammatik von Klassen, Methoden

class Vorlesung1 {

    public static void main(String[] argv){
	System.out.println(sumOfSqTo(10));
    }

    public static int sumOfSqTo(int n){
	return SQ(1, n);
    }


    public static int SQ(int lowBound, int highBound){
	if(highBound <= lowBound)
	    return (highBound*highBound);

	return (highBound*highBound)+SQ(lowBound, highBound - 1);
    }
}
