package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;

public class Driver {
    private Integer id = null;
    private String name,surname,jmb;
    private LocalDate birthday,hire_date;

    public Driver(String name, String surname, String jmb, LocalDate datum_rodjenja, LocalDate datum_zaposlenja) {
        this.name = name;
        this.surname = surname;
        this.jmb = jmb;
        this.birthday = birthday;
        this.hire_date = hire_date;
    }

    public Driver(Integer id, String name, String surname, String jmb, LocalDate datum_rodjenja, LocalDate datum_zaposlenja) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.jmb = jmb;
        this.birthday = birthday;
        this.hire_date = hire_date;
    }

    public Driver() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJmb() {
        return jmb;
    }

    public void setJmb(String jmb) {
        this.jmb = jmb;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate datum_zaposlenja) {
        this.hire_date = hire_date;
    }

    @Override
    public String toString() {
        return " -> (" + this.getName() + " " + this.getSurname() + " ( " + this.getJmb() + " ))";
    }

    public boolean equals(Driver d){ return (d.getJmb().equals(this.getJmb()));
    }


    public void getId(int id) {

    }
}
