import java.util.Scanner;
class methodfact{
      static int fact(int n){
	if(n<=1){
		return 1;
	}
	else{
	   return n*fact(n-1);
	}
   public static void main(String[]args)
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("Factorial is "+fact(n));
   }
}
     