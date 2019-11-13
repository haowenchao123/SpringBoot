package hellospringboot.demo.pojo;

import java.util.Date;

public class Student {

    private Integer id;
    private Integer student_id;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;

    public void setId(){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setStudentId(){
        this.student_id = student_id;
    }

    public Integer getStudentId(){
        return student_id;
    }

    public void setName() {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(){
        this.age = age;
    }

    public Integer getAge(){
        return age;
    }

    public void setSex(){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }

    public void setBirthday(){
        this.birthday = birthday;
    }

    public Date getBirthday(){
        return birthday;
    }

}
