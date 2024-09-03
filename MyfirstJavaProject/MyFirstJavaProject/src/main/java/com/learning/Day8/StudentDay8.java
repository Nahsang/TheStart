package Day8;

import java.util.Objects;

public class StudentDay8 {

   private int id;
    private String name;
   private double grade;
    private String address;


    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDay8 that = (StudentDay8) o;
        return id == that.id && Double.compare(grade, that.grade) == 0 && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, address);
    }

    @Override
    public String toString() {
        return "StudentDay8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
