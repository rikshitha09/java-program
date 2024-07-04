import java.util.Scanner;
class operation{
    public static void SUM(int a,int b){
	int add=a+b;
	System.out.println("add: "+add);
    }
    public static void SUB(int a,int b){
	int sub=a-b;
	System.out.println("sub: "+sub);
    }
    public static void MUL(int a,int b){
	int mul=a*b;
	System.out.println("mul: "+mul);
    }
    public static void DIVIDE(int a,int b){
	int divide=a/b;
	System.out.println("divide: "+divide);
    }
    public static void main(String[]args){
	Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1.ADD 2.SUB 3.MUL 4.DIV");
        int c=s.nextInt();
        if(c==1){
            SUM(a,b);
        }else if(c==2){
	        SUB(a,b);
        }else if(c==3){
	         MUL(a,b);
        }else{
	        DIVIDE(a,b);
	    }
   }
}