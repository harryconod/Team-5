import java.util.Scanner;

public class Math {

    /*
    Developer : Isra Shire
    University ID: 180193455
    Function : This function takes two inputs as integers and returns the sum
     */
    public static void main(String[] args)
    {
        System.out.println("Add any two integers to create a sum: ");
        Scanner readInput = newScanner(System.in);
        int x = readInput.nextInt();
        int y = readInput.nextInt();
        readInput.close();
        System.out.println("The sum of x and y is = " + Integer.sum(x,y));
    }
    /*
     Developer: Isra Shire 
     University ID: 180193455
     Function : This function takes two integer as input, subtract the second input from first one and returns the result.
     */
    public static void Main(String[] arg)
    {
     int x,y,z
     Scanner s=new Scanner(System.in);
     System.out.println("Enter first integer");
     x=s.nextInt();
     System.out.println("Enter second integer");
     y=s.nextInt();
    if(x>y)
    z=x-y;
    else
    z=y-x;
    System.out.println("The subtraction of the two integers is :" + z);
    }
<<<<<<< HEAD

    /*
    Developer : Abhiram
    Uni ID : 220280464
    Function : Calculate Modulus of two number
    */
    public static int mod(int x, int y){
        return x%y;
=======
    /*
    Developer: Harry Conod
    University ID: 220244134
    Function: This function takes two integers as input and returns the largest one, or 0 if both are equal
     */
    public int Max(int x, int y){
        if (x>y)
            return x;
        else if (x<y)
            return y;
        else
            return 0;
    }
    /*
    Developer: Harry Conod
    University ID: 220244134
    Function: This function takes two integers as input and returns the smallest one, or 0 if both are equal
     */
    public static int Min(int x, int y){
        if (x>y)
            return y;
        else if (x<y)
            return x;
        else
            return 0;
>>>>>>> d866d7c8731e6fce84f01662291cca19eadd31ce
    }
}
}