public class demostaticandNonStatic {
    public int abc = 100;
    public static int pqr =200;

    public  void demo1()
    {System.out.println("this is demo 1");
abc =300;
pqr =400;}
    public static void demo2 ()
    {System.out.println("this is demo 2");//c =600;//we cannot change non stativ riable into static method;
pqr =800;}
}