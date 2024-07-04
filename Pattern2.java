import java.util.Scanner;
class Pattern2{
   public static void main(String[]args){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=obj.nextInt();
	int x=1;
	int i,j;
	for(i=n;i>=1;i--){
		for(j=1;j<=i-1;j++){
			System.out.print(" ");
		}
		for (int k=1;k<=(n-i+1);k++){
			System.out.print(x);
			x++;
		}
		System.out.println();
	}
    }
}	