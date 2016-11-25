package utils;

public class Math {
static public int factorial(int i){
	if(i > 0 ){
	return i*factorial(i-1); 
	}
	else return 1;
}
static public int factorialLoop(int i){
	int q = 1;
	for(i=i;i>0;i--){
		
		q =q*i;
	}
	return q;
}

}
