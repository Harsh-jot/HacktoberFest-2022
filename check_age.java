import java.util.*;
public  class check_age {
    static boolean check_age(int age)
    {
        if(age<18)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(check_age(age))
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
