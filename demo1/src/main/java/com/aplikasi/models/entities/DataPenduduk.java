package com.aplikasi.models.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;




@Entity
@Table(name = "tbl_dataPenduduk")
public class DataPenduduk implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "nik tidak boleh kosong")
    @Column(nullable = false,unique = true)
    private String nik;

    @NotEmpty(message = "nama tidak boleh kosong")
    private String name;

    @Column(length = 500)
    private String address;
    
    private String gender;
   
    private LocalDate birth;

    private String country;
    
    
    public DataPenduduk(){
    }

    

    public DataPenduduk(long id, @NotEmpty(message = "nik tidak boleh kosong") String nik,
            @NotEmpty(message = "nama tidak boleh kosong") String name, String address, String gender, LocalDate birth,
            String country) {
        this.id = id;
        this.nik = nik;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.birth = birth;
        this.country = country;
    }




    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }



    public String getNik() {
        return nik;
    }



    public void setNik(String nik) {
        this.nik = nik;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public LocalDate getBirth() {
        return birth;
    }



    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public static Iterable<DataPenduduk> findAll() {
        return null;
    }


}
