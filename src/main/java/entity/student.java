package entity;

public class student {
    private int id;
    private String name;
    private String password;
    private Long age;
    private String description;
    private String sex;


    public student(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public student(){}

    public student(String name, String password, Long age, String description, String sex) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.description = description;
        this.sex = sex;
    }

    public int getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
