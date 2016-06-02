class TestatRecursion{


    public static void main(String argv[]){

	int[] arr = new int[5];

	arr[0] = -2;
	arr[1] = 3;
	arr[2] = 6;
	arr[3] = 10;
	arr[4] = 12;

	char[] s = {'a', 'l', 'l', 'a'};
	char[] s1 = {'h', 'a', 'a', 'l', 'o'};
	
	
	System.out.println(digitSum(1234));
	System.out.println(harm(5));
	System.out.println(power(2, 5));
	System.out.println(powerPlus(2, 5));
	System.out.println(binaryCode(32));
	System.out.println(maximum(arr, 4));
	System.out.println(isSorted(arr, 4));
	System.out.println(contains(arr, 4, 21));
	System.out.println(countPositives(arr, 0, 4));
	System.out.println(contentCheck(s, s1, 4));
	System.out.println(palindromCheck(s, 0));

	

    }

    public static boolean palindromCheck(char[] arr, int i){

	if(i<0 || arr.length <= i)
	    return false;

	if(i >= arr.length-1-i)
	    return true;
	
	if(arr[i] == arr[arr.length-1-i])
	    return palindromCheck(arr, i+1);

	return false;

    }
	

    public static boolean contentCheck(char[] a, char[] b, int i){
	if(i<0 || i>=a.length || i>=b.length){
	    return false;
	}
	if(a[i] != b[i])
	    return false;

	if(i == 0)
	    return true;

	return contentCheck(a, b, i-1);
    }
	


    public static int digitSum(int n){

	if(n < 10)
	    return n;

	return (n % 10)+digitSum(n/10);
    }

    public static double harm(int n){

	double m = n;

	if(n <= 1)
	    return 1;

	return (1/m)+harm(n-1);

    }

    public static int power(int a, int n){

	if(n <= 0)
	    return 1;

	return a*power(a, n-1);
    }

    public static int powerPlus(int a, int n){
	if(n == 0)
	    return 1;

	if(n % 2 == 0)
	    return powerPlus(a, n/2)*powerPlus(a, n/2);

	if(n % 2 == 1)
	    return a*powerPlus(a, (n-1)/2)*powerPlus(a, (n-1)/2);

	return -11;

    }

    public static String binaryCode(int i){
	int m = i / 2;
	int r = i % 2;

	if(m == 0)
	    return r+"";

	return binaryCode(m)+r;
    }

    public static int maximum(int[] arr, int i){
	
	if(i == 0)
	    return 0;
	if(i < 0 || i >= arr.length)
	    return -1;
	
	int m = maximum(arr, i -1);

	if(arr[m] > arr[i])
	    return m;

	return i;

    }

    public static boolean isSorted(int[] arr, int i){
	if(i <= 0)
	    return true;

	if(i >= arr.length)
	    return false;

	boolean t = isSorted(arr, i - 1);

	if(!t)
	    return false;

	return arr[i] >= arr[i-1];

    }

    public static boolean contains(int[] arr, int i, int x){
	if(i < 0 || i >= arr.length)
	    return false;

	if(arr[i] == x)
	    return true;

	return contains(arr, i -1 , x);

    }

    public static int countPositives(int[] arr, int d, int t){
	if(d < 0 || t >= arr.length)
	    return -1;

	if(d == t && arr[d] > 0)
	    return 1;

	if(d == t && arr[d] <= 0)
	    return 0;

	if(arr[d] > 0)
	    return 1 + countPositives(arr, d+1, t);

	return countPositives(arr, d+1, t);

    }



	

	

}
