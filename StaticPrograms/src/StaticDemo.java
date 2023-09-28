
public class StaticDemo {
	public static void main(String[] args) {
        Student s1=new Student(1,"Rathan R Nayak");
        Student s2=new Student(2,"Virat Kohli");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("before modification : "+Student.school);
        Student.modify("Shri Madhwa Vadiraja Institute of Technology & Management");
        System.out.println("after modification : "+Student.school);
    }
}
