import java.util.Scanner;
class matrix{
   public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
	int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
		array[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                System.out.print(array[i][j] *2+" ");
            }
            System.out.println();
        }
    }
}			