

import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    long[] x=new long[4];
    for(int i=0;i<4;i++){
      x[i]=s.nextLong();
    }
    Arrays.sort(x);
    for(int i=x.length-1;i>=0;i--){
      if(i != x.length-1){
           System.out.print(" > ");
      }
      System.out.print(x[i]);
    }
  }
}

