package table;

import org.hibernate.annotations.Type;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Students {
    private Integer id;
    private String uname;
    private Byte gender;
    private Integer age;
    private Integer grade;
    private String clazz;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "gender")
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "grade")
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(id, students.id) &&
                Objects.equals(uname, students.uname) &&
                Objects.equals(gender, students.gender) &&
                Objects.equals(age, students.age) &&
                Objects.equals(grade, students.grade) &&
                Objects.equals(clazz, students.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uname, gender, age, grade, clazz);
    }
}
