public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to CS 112!");
        Main.sayHello();
        Main.randomNum();

        Video testDefault = new Video();
        Video testFull = new Video("Totally real Youtube video", "real_channel", 
                "An absolutely, positively, 100% genuine real video. Was this made up? Maybe", 10.45, true, false);
        Video testCopy = new Video(testFull);

        System.out.println(testDefault.toString());
        System.out.println(testFull.toString());
        System.out.println(testCopy.toString());

        testCopy.equals(testFull);
        testCopy.equals(testDefault);


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