public class CharacterSearchTree
{

    // Vorgaben

    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;

    public CharacterSearchTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }
    public CharacterSearchTree(char[] chars){


	
	for(int i = 0; i < chars.length; i++){
	    iterativeAdd(chars[i]);

	}
    }


    public void add(char t, int q, String c){

	if(!isEmpty()){
	    if(content.getToken() == t){
		for(int i = 0; i < q; i++){
		    content.incrementQuantity();
		}
		content.setCode(c);
		
	    }
	    if(content.getToken() > t){
		leftChild.add(t, q, c);
	    }
	    if(content.getToken() < t){
		rightChild.add(t, q, c);
	    }
	}
	else{
	    content = new HuffmanTriple(t, q);
	    leftChild = new CharacterSearchTree();
	    rightChild = new CharacterSearchTree();
	}
	

	


    }

    public void showPreOrder(){
	if( !isEmpty()){

	    if(isLeaf()){
		System.out.print("*");
	    }

	    System.out.println(content.toString());
	    leftChild.showPreOrder();
	    rightChild.showPreOrder();
	}

    }

    public int height(){

	if(isEmpty()){
	    return 0;
	}
	else{
	    int heightRightChild = rightChild.height();
	    int heightLeftChild = leftChild.height();
	    if(heightRightChild > heightLeftChild)
		return 1+heightRightChild;

	    return 1+heightLeftChild;
	}
    }

    public int countCharacters(){

	if(isEmpty())
	    return 0;
	else{

	    return content.getQuantity()+leftChild.countCharacters()+rightChild.countCharacters();
	}
    }

    public int longestCode(){

	if(isEmpty()){
	    return 0;
	}else{
	    int rightLongest = rightChild.longestCode();
	    int leftLongest = leftChild.longestCode();
	    int c;
	    if(rightLongest > leftLongest)
		c = rightLongest;
	    else
		c = leftLongest;

	    if(c > content.getCode().length())
		return c;
	    else
		return content.getCode().length();
	}
    }

    public HuffmanTriple minimum(){
	HuffmanTriple t = null;
	if(isEmpty()){
	    return null;
	}else{
	    CharacterSearchTree current = this;
	    
	    while(current != null && !current.isEmpty()){
		t = current.getContent();
		current = current.leftChild;
	    }
	}
	return t;
    }

    public boolean onlyCompleteNodes(){
	if(isEmpty()){
	    return true;
	}
	else{
	    if(isLeaf()){
		return true;
	    }
	    return (!leftChild.isEmpty() && !rightChild.isEmpty() && rightChild.onlyCompleteNodes() && leftChild.onlyCompleteNodes());
	      
	}
    }

    public boolean contains(char t){
	if(isEmpty()){
	    return false;
	}else{
	    if(content.getToken() == t)
		return true;
	    if(content.getToken() < t)
	       return rightChild.contains(t);

	   return leftChild.contains(t);
	}
    }


    public boolean equalStructure(CharacterSearchTree other){
	if(isEmpty() == other.isEmpty() && isEmpty() == false){
	    return rightChild.equalStructure(other.rightChild) && leftChild.equalStructure(other.leftChild);
	    
	}else if(isEmpty() == other.isEmpty() && isEmpty() == true){
	    return true;
	}
	else {
	    return false;
	}
    }

    public CharacterSearchTree rotateRight(){
	if(isEmpty())
	    return this;
	else{
	    CharacterSearchTree left = leftChild;
	    if(left.isEmpty())
		return this;

	    leftChild = left.rightChild;
	    left.rightChild = this;

	    return left;
	}
    }
	    
	    
	 
	       
	  
	    
	

    

    public HuffmanTriple getContent()
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isEmpty() 
    {
        return content == null;
    }

    public boolean isLeaf() 
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void iterativeAdd( char t )
    {
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() ) 
        {
            current.content = new HuffmanTriple( t );
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            current.content.incrementQuantity();
        }
    }

    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }

}
