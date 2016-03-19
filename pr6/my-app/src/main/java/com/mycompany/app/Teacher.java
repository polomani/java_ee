package com.mycompany.app;
import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Polomani on 25.02.2016.
 */


@Entity
@Table(name="TEACHERS")
@NamedQueries({
        @NamedQuery(name = Teacher.FIND_ALL, query="select t from Teacher t"),
        @NamedQuery(name = Teacher.FIND_BY_ID, query="select t from Teacher t where t.id = :id")
})
public class Teacher {
    public static final String FIND_ALL = "Teacher.findAll";
    public static final String FIND_BY_ID = "Teacher.findByID";

    @Id
    @GeneratedValue
    private int teacherId;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="cell_phone")
    private String cellphone;

    @OneToOne(fetch = FetchType.EAGER, optional = true, cascade = {CascadeType.ALL})
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy="teacher", fetch = FetchType.EAGER)
    private List<Lecture> lectures =  new ArrayList<Lecture>();

    public int getTeacherId() {
        return teacherId;
    }

    public Teacher() {
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "address=" + address +
                ", teacherId=" + teacherId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate=" + birthDate +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (teacherId != teacher.teacherId) return false;
        if (address != null ? !address.equals(teacher.address) : teacher.address != null) return false;
        if (birthDate != null ? !birthDate.equals(teacher.birthDate) : teacher.birthDate != null) return false;
        if (cellphone != null ? !cellphone.equals(teacher.cellphone) : teacher.cellphone != null) return false;
        if (firstname != null ? !firstname.equals(teacher.firstname) : teacher.firstname != null) return false;
        if (lastname != null ? !lastname.equals(teacher.lastname) : teacher.lastname != null) return false;
        if (lectures != null ? !lectures.equals(teacher.lectures) : teacher.lectures != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (lectures != null ? lectures.hashCode() : 0);
        return result;
    }
}
