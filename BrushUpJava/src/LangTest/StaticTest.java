package LangTest;

public class StaticTest {
    public int number;
    public static int staticNumber = 10;

    public void testMe(){
        System.out.println("I am test me");
    }

    public static void realTest(){
        System.out.println("this is static property" + staticNumber);
        System.out.println("Accessing instance property");
        StaticTest obj = new StaticTest();
        obj.number = 10;
        System.out.println(obj.number);
    }
}
