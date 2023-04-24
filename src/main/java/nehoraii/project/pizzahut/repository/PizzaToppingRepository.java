package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaToppingRepository extends JpaRepository<PizzaEntity,Long> {
}
