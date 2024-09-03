package Day8;

public class main {
    public static void main(String[] args) {


        StudentDay8 s1 = new StudentDay8();
                s1.setId(343);
                s1.setAddress("hwekhbe");
                s1.setGrade(77);


        StudentDay8 s2 = new StudentDay8();
        s1.setId(343);
        s1.setAddress("hwekhbe");
        s1.setGrade(77);
System.out.println(s2);
System.out.println(s1);
        System.out.println(s1.equals(s2));

    }
}
