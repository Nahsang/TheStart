package day6;
// attributes or var
public class Person extends Student{

    private String demo;
    private int id;
    private int address;


    public void setdemo (String demo){
      this.demo = demo;
    }

    public String getDemo() {
        return demo;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setAddress(int address) {
        this.address = address;
    }


    public int getAddress() {
        return address;
    }
}



