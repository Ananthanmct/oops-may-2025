package encapsulationexamples;

public class teachers {
  private  int id;
  private  String name;
  private  String qualifications;
  private  double salary;
   private int age ;
   private  String gender;

    @Override
    public String toString() {
        return "teachers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
