
import java.util.Scanner;
public class Math{

    public static void main(String args[]){//main method
        Scanner scan=new Scanner(System.in);
//create a scanner instance for receives input
// from the user - input from keyboard
        System.out.print("Enter the value to num1: ");
        int num1=scan.nextInt();
        System.out.print("Enter the value to num2: ");
        int num2=scan.nextInt();
        int result=divisionNum(num1,num2);//calling the method
        System.out.println("Division of "+num1+" and "+num2+":"+result);

    }
    static int divisionNum(int x,int y){//user defind method
        if (y==0)
        {
            return 0;
        }
        else if (x-y==0){
            return 1;
        }
        else if (x<y){
            return 0;
        }
        else{
            return (1+divisionNum(x-y,y));
        }
    }

}

