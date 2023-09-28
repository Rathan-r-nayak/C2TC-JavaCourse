
public class Student{
    int id;
    String name;
    static String school="SMVITM";
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    static void modify(String sc)
    {
        school=sc;
    }
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
    
}