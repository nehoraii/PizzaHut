package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Long> {
    @Query(value = "select * from employees where id_of_employee=?1",nativeQuery = true)
    EmployeesEntity getByIDEmployee(String idEmployee);

}
