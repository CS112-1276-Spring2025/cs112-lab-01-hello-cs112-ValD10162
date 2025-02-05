public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!");
        Main.sayHello();
        Main.randomNum();

        Video test1 = new Video();


    }

    public static void sayHello()
    {
        System.out.println("Hello!!");
    }

    public static double randomNum()
    {
        double random = Math.random();
        int wholeNum = (int)(random * 10) * 1;
        System.out.println(wholeNum);

        return random;
    }
}