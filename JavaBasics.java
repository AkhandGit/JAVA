/*import java.util.Scanner;*/


/* 

public class JavaBasics{
    public static void main(String arg[]){
        System.out.print("Hello World");
    }
}



/*

 public class JavaBasics{
    public static void main(String arg[]){
        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
    }
 }

 */

 /* 
 public class JavaBasics{
    public static void main(String arg[]){
        int a=10;
        int b=5;
        int sum= a+b;
        System.out.print(sum);
    }
 }

 */

 /*

import java.util.*;

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
 }

*/


/* 
import java.util.*;

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println(area);
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        char ch='a';
        int num=ch;
        System.out.println(num);
    }
}

*/

//practice questions


/*
public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(a+b+c)/3;
        System.out.println(d);
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        float Pencil=sc.nextFloat();
        float Pen=sc.nextFloat();
        float Eraser=sc.nextFloat();
        float Total=(Pencil+Pen+Eraser)+((Pencil+Pen+Eraser)*0.18f);
        System.out.println(Total);
    }
}

*/

/*
public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("add"+(a+b));
    }
}

*/


/*
public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter temperature:");
        double Temp=sc.nextDouble();
        if (Temp>100){
            System.out.println("You have fever");

        }
        else{
            System.out.println("You dont have fever");
        }
    }
}

*/



/*
public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int Num=sc.nextInt();
        switch (Num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        int i=0;
        while(i<10){
            System.out.println("hello");
            i++;
        }
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:-");
        int num=sc.nextInt();
        int temp=num;
        System.out.println(temp);
    }
}


*/


/*

public class JavaBasics{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a num:-");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum+=i;
            i++;

        }
        System.out.print("Sum is :-"+ sum);
    }
}


*/


/*
public class JavaBasics{
    public static void main(String arg[]){
        int n=1099;
        int temp=0;
        while(n>0){
            temp=(temp*10)+n%10;
            n/=10;

        }
        System.out.print(temp);

    }
}

*/


/*

public class JavaBasics{
    public static void main(String arg[]){
        int[] arr={2,0,2,1,1,0};
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for ( int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        int [] a={1,2,3,4,5};
        int [] b={4,5,6,7};
        int [] c=new int;

        for(int i=0; i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    for (int k=0;k<a.length+1;k++){
                        System.out.println(c[k]=a[i]);
                    }

                }
            }
        }
    }
}


*/
/*
!!! merge sort !!!

public class JavaBasics{
    public static void main(String arg[]){
        int a[]={1,3,8};
        int b[]={2,4,6};
        int c[]= new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        int l1=a.length;
        int l2=b.length;
        while(i<l1 && j<l2){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;

            }
        }
        while(i<l1){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<l2){
            c[k]=b[j];
            j++;
            k++;
        }
        for(i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}


*/

/*

public class JavaBasics{
    public static void main(String arg[]){
        int arr[]={7,4,1,2,9};
        int i;
        int min=9999,max=0;

        for(i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("max"+ max);
        System.out.println("min"+ min);
    }
}

*/

/*


public class JavaBasics{
    public static void main(String arg[]){
        int X=5;
        int K=4;
        System.out.println(K/X);
    }
}

*/


/*

public class JavaBasics{
    public static void main(String arg[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

/*

public class JavaBasics{
    public static boolean isPrime(int n) {
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println( i +" ");
            }
        }
    }
    public static void main(String arg[]){
        primesinRange(20);
    }
        
    
}

*/

/*

abstract class a{
    int 
    void disp()
}

class B extends A{
    void disp()
    {
        System.out.println("In B");
    }
}

class FirstJava{
    public static void main(String str[]){
        A obj =new B();
        obj.disp();
        
    }
}

*/

/*

interface Inter1{
    public static final int i=5;
    public abstract void disp();

}
class Child implements Inter1{
    int j=7;
    public void disp(){
        System.out.println(i+j);
    }
}
class TestInterface{
    public static void main(String str[])
    {
        Inter1 obj=new Child();
        obj.disp();
        System.out.println(obj.i+obj.j);
    }
}

*/


/*
public class JavaBasics{
    public static int binDec(int n){
        int lastDigit=n%10;
        double pow=0;
        double sum=0;
        while(n>0){
            sum=sum+(lastDigit* Math.pow(2,pow));
            n/=10;
            pow++;
            
        }
        
    }
}



*/
/*

public class JavaBasics{
    public static void main(String arg[]){
        double n=8;
        double c= Math.sqrt(8);
        
        System.out.println(c);
    }
}

*/
