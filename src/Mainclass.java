
public class Mainclass {
   public static void main(String[] args) {
       Students stu1 =new Students ();
       stu1 .id=122;
       stu1.name = "anand";
       stu1 .rank =  "first";
       stu1 .address =" 1/23 chennai tamilnadu";
       stu1. gender ="male";


       System.out.println("Student-bio-data  " +stu1);
       demostaticandNonStatic demo = new demostaticandNonStatic();
       System.out.println(demo.abc);
       System.out.println(demostaticandNonStatic.pqr);
       demo.demo1();
       demostaticandNonStatic.demo2();

       final int aa =100;
       int bb= 200;
System.out.println(aa);
System.out.println(bb);
// =200;//we cannot change value for final variable
bb =500;
}}
