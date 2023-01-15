import java.util.Scanner;
 class Hariom{
    public static void main(String args[]){
        float a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.format("%.4f", (a+b)/2);
    }
}