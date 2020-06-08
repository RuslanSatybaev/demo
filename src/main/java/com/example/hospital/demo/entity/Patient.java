package com.example.hospital.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties

@Table(name = "Patient")
public class Patient {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer phone;
    private String address;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    //  @Basic
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Patient patient = (Patient) o;
////        return Objects.equals(id, patient.id) &&
////                Objects.equals(firstname, patient.firstname) &&
////                Objects.equals(lastname, patient.lastname) &&
////                Objects.equals(email, patient.email) &&
////                Objects.equals(phone, patient.phone) &&
////                Objects.equals(address, patient.address);
////    }
////
////    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstname, lastname, email, phone, address);
//    }
//}

//@Entity
//@Table(name = "patient")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Patient {
//    @Id
//    @Column(name = "id")
//    @SequenceGenerator(name = "clientsIdSeq", sequenceName = "clients_id_seq", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq")
//    private Long id;
//
//    private String title;
//
//
//    @Column(columnDefinition = "name")
//    private String name;
//
//    @Column(columnDefinition = "email")
//    private String email;
//
//    @Column(columnDefinition = "phone")
//    private String phone;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

//}
