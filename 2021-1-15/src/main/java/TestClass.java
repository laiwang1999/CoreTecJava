import java.util.Date;

public class TestClass {
    private String name;
    private int age;
    private Date birth;
    public TestClass(String name,int age,Date birth){
        this.age = age;
        this.name = name;
        this.birth = birth;
    }
    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
