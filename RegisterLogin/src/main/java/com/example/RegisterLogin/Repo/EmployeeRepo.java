package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
    Employee findByEmail(String email);

    Optional<Employee> findOneByEmailAndPassword(String email, String password);



}
