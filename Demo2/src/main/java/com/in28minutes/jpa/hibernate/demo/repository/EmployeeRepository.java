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
public class EmployeeRepository {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    EntityManager em;
 
    public void insert(Employee employee) {
        em.persist(employee);
    }
 
    public List<Student> retrieveEmployees() {
        return em.createQuery("select e from Student e",Student.class).getResultList();
    }
 
    public Employee findById(Long id) {
        Employee emp = em.find(Employee.class, id);

        logger.info("Employee -> {}", emp);
        return emp;
    }
 
    public Employee save(Employee e) {
 
        if (e.getId() == null) {
            em.persist(e);
        } else {

            System.out.println("inside merge");
            em.merge(e);

        }
 
        return e;
    }
 
    public void deleteById(Long id) {
        Employee e = findById(id);
        em.remove(e);
    }
 
    public void playWithEntityManager() {
        Employee e1 = new Employee("Namrata",6700.0, null);
        em.persist(e1);

        Employee ex = findById(1L);

        ex.setName("xxx");
        ex.setSalary(100);

    }
 
}