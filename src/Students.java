public class Students {
    public int id ;
    public String name;
    public String gender;
    public String rank;
    public String address ;

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", rank='" + rank + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
