package qwerty.springboot.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import qwerty.springboot.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
