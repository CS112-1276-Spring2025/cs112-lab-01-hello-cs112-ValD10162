public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!");
        Main.doNothing();
        Main.randomNum();

        Video test1 = new Video();


    }

    public static void doNothing()
    {
        //idk it does nothing
    }

    public static double randomNum()
    {
        double random = Math.random();
        int wholeNum = (int)(random * 10) * 1;
        System.out.println(wholeNum);

        return random;
    }
}