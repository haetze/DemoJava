 public class Testumgebung
{
    public static void main( String[] args )
    {
        testMethods();
    }
    
    private static void testMethods()
    {
        //char[] chars = {'n','d','a','f','b','e','k','i','x','o','s','z','r'};
	char[] chars = {'n','d','a','f','b','e'};
        CharacterSearchTree cst = new CharacterSearchTree( chars );
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x z");
        cst.show();
	cst.add('b', 12, "001");
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x z");
        cst.show();
	System.out.println();
	cst.showPreOrder();
	/*System.out.println(cst.height());
	System.out.println(cst.countCharacters());
	System.out.println(cst.longestCode());
	System.out.println(cst.minimum().toString());
	System.out.println(cst.onlyCompleteNodes());
	System.out.println((new CharacterSearchTree()).onlyCompleteNodes());
	System.out.println(cst.contains('q'));
	System.out.println(cst.equalStructure(new CharacterSearchTree()));*/
	System.out.println();
	cst = cst.rotateRight();
	cst.showPreOrder();
        // weitere Tests ergaenzen
    }

}

