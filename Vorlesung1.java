//Richard Stewing
//<20.04.2016>

//Grammatik von Klassen, Methoden

class Vorlesung1 {

    public static void main(String[] argv){
	System.out.println(SQ(9,10));
    }

    public static int sumOfSqTo(int n){
	return SQ(1, n);
    }


    //returns sum of squares
    //both bounds' square's are inclusive
    public static int SQ(int lowBound, int highBound){ 
	if(highBound <= lowBound)
	    return (highBound*highBound);

	return (highBound*highBound)+SQ(lowBound, highBound - 1);
    }
}

/*

sumOfSq = sum . map (\x -> x*x)
sumOfSqWithUpperBound x = sumOfSq [1..x]
sumOfSqWithLowerAndUpperBounds x y = sumOfSq [x..y]

the same program in Haskell
*/
