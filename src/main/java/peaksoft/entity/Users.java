package peaksoft.entity;
import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String name;
 private String surName;
 private byte age;
 private String nationality;

    public Users(long id, String name, String surName, byte age, String nationality) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.nationality = nationality;
    }

    public Users() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        System.out.println(id + "\t|\t" +
                name + "\t\t|\t" +
                surName + "\t|\t" +
                age + "\t| " +
                nationality +"\t  |");
        return "";
    }
}
