class Compress{

    public static void main(String argv[]){

	int[] a = new int[10];

	for(int i = 0; i < 5; i++){
	    a[i] = 0;
	    a[i+5] = i;
	}
	a[0] = 10;
	compress(a);

	for(int val: a){

	    System.out.println(val);
	}



    }


    public static void compress(int [] arr){
	int next0 = 0;
	int nextVal = 1;

	while(next0 < arr.length && nextVal < arr.length){

	    if(arr[next0] != 0){
		next0++;
		nextVal++;
	    }else{

		if(arr[nextVal] != 0){

		    arr[next0] = arr[nextVal];
		    arr[nextVal] = 0;
		    next0++;
		}else{
		    nextVal++;
		}
	    }
	}
    }
}
