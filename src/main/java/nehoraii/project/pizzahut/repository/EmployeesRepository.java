package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Long> {
}
