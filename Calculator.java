class AdditionClass{
    //int a;
    //int b;
    public int Addition(int a,int b)
    {
        System.out.println("Calling adddition method");
        return a+b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the addition");
         int num1=10;
         int num2=20;
        // int result=num1+num2;
        // System.out.println("Addition of two numbers are :"+result);
        AdditionClass additionClass = new AdditionClass();
        int result=additionClass.Addition(num1,num2);
        System.out.println(result);
    }
    
}
