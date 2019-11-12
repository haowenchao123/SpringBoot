package hellospringboot.demo.pojo;

import java.util.Date;

public class Student {

    private Integer id;
    private Integer student_id;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;

    public Student(Integer id, Integer student_id, String name, Integer age, String sex, Date birthday){
        this.id = id;
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Integer getId(){
        return id;
    }

    public Integer getStudentId(){
        return student_id;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getSex(){
        return sex;
    }

    public Date getBirthday(){
        return birthday;
    }

}
