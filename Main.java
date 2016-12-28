//This is a test.
/**
* The following three methods are to calculate the nth number in a Fibonacci sequence.
* Assume 0<=n<=45.
*/
public class Main {
	public static int[] arr=new int [50];
	//The recursive method, with a complexity of O(2^n)
	public static int recursiveMethod(int n){
		if(n<0) return 0;
		if(n==0)return 1;
		if(n==1)return 1;
		return recursiveMethod(n-1)+recursiveMethod(n-2);
	}
	//The method using an array, with a complexity of O(n)
	public static int arrayMethod(int n){
		if(n<0) return 0;
		if(n==0) return 1;
		else if(n==1)return 1;
		else{
			arr[0]=1;arr[1]=1;
			for(int i=2;i<=n;i++)arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	//The look-up method using recursion and an array, with a complexity of O(n)
	public static int lookupMethod(int n){
		if(n<0) return 0;
		if(n==0)arr[0]=1;
		else if(n==1)arr[1]=1;
		if(arr[n]==0)return (arr[n]=lookupMethod(n-1)+lookupMethod(n-2));
		return arr[n];
	}
	//An instance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test the time to run each method
		long timeElapsed=System.currentTimeMillis();
		System.out.println(recursiveMethod(40));
		timeElapsed=System.currentTimeMillis()-timeElapsed;
		System.out.println(timeElapsed);
		for(int i=0;i<50;i++) arr[i]=0;
		timeElapsed=System.currentTimeMillis();
		System.out.println(arrayMethod(40));
		timeElapsed=System.currentTimeMillis()-timeElapsed;
		System.out.println(timeElapsed);
		for(int i=0;i<50;i++) arr[i]=0;
		timeElapsed=System.currentTimeMillis();
		System.out.println(lookupMethod(40));
		timeElapsed=System.currentTimeMillis()-timeElapsed;
		System.out.println(timeElapsed);
	}

}
