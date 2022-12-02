package com.in28minutes.jpa.hibernate.demo.entity;



import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Passport {
    
    @Id
    @GeneratedValue
    int passportId;
    
    @OneToOne(mappedBy="passport")
    Employee e;
    
    String number;
    
    LocalDate date;
    
    public Passport() {
        
    }



   public Passport(String number, LocalDate date) {
        super();
       
        this.number = number;
        this.date = date;
    }



   public int getPassportId() {
        return passportId;
    }



   public void setPassportId(int passportId) {
        this.passportId = passportId;
    }



   public String getNumber() {
        return number;
    }



   public void setNumber(String number) {
        this.number = number;
    }



   public LocalDate getDate() {
        return date;
    }



   public void setDate(LocalDate date) {
        this.date = date;
    }



   @Override
    public String toString() {
        return "Passport [passportId=" + passportId + ", number=" + number + ", date=" + date + "]";
    }
    
    
    
}




















/*
 * package com.in28minutes.jpa.hibernate.demo.entity;
 * 
 * import java.time.LocalDate;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id;
 * 
 * @Entity public class Passport {
 * 
 * @Id
 * 
 * @GeneratedValue int passportId; Long empid; String firstName; LocalDate date;
 * 
 * public int getPassportId() { return passportId; } public void
 * setPassportId(int passportId) { this.passportId = passportId; } public Long
 * getEmpid() { return empid; } public void setEmpid(Long empid) { this.empid =
 * empid; } public String getFirstName() { return firstName; } public void
 * setFirstName(String firstName) { this.firstName = firstName; } public
 * LocalDate getDate() { return date; } public void setDate(LocalDate date) {
 * this.date = date; }
 * 
 * public Passport(int passportId, Long empid, String firstName, LocalDate date)
 * { super(); this.passportId = passportId; this.empid = empid; this.firstName =
 * firstName; this.date = date; }
 * 
 * @Override public String toString() { return "Passport [passportId=" +
 * passportId + ", empid=" + empid + ", firstName=" + firstName + ", date=" +
 * date + "]"; }
 * 
 * 
 * }
 */