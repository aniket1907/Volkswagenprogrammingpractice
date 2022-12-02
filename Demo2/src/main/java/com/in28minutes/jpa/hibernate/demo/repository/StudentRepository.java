package com.in28minutes.jpa.hibernate.demo.repository;
 
import java.util.List;
 
// Change from javax to jakarta
import javax.persistence.EntityManager;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.in28minutes.jpa.hibernate.demo.entity.Employee;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
 
@Repository
@Transactional
public class StudentRepository {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    EntityManager st;
 
    public void insert(Student student) {
        st.persist(student);
    }
 
    public List<Student> retrieveStudents() {
        return st.createQuery("select e from Student e",Student.class).getResultList();
    }
 
    
 
}