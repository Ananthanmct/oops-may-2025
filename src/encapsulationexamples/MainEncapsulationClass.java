package encapsulationexamples;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        teachers teacher1 = new teachers();
        //teacher1.id = 123;
        teacher1.setId(123);
        teacher1.setAge(33);
        teacher1.setGender("male");
        teacher1.setQualifications("biology");
        teacher1.setSalary(12000);
        System.out.println(teacher1);

    }
}
