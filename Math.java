public class Math {
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
    }
}
