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
public class Teacher {
    @Id
    @GeneratedValue
    private int teacherId;

    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
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
}
