package edu.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// SQL: SELECT * FROM empdetails WHERE name='Abc'
	// HQL: FROM Employee WHERE name='Abc'
	
	@Query(value = "FROM Employee WHERE name='Abc'")
	List<Employee> getEmpByName_HQL();
	
	@Query(value = "SELECT * FROM empdetails WHERE name='Abc'", nativeQuery = true)
	List<Employee> getEmpByName_SQL();
	
	// SQL: SELECT * FROM empdetails WHERE name=?
	// HQL: FROM Employee WHERE name=?
	
	@Query(value = "FROM Employee WHERE name= :nm")
	public List<Employee> getEmpByName_ParamHQL(@Param("nm") String name);
	
	@Query(value = "SELECT * FROM empdetails WHERE name= :nm", nativeQuery = true)
	public List<Employee> getEmpByName_ParamSQL(@Param("nm") String name);
	
}
