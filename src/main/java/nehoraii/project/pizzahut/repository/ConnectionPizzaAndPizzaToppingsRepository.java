package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ConnectionPizzaAndPizzaToppingsRepository extends JpaRepository<ConnectionPizzaAndPizzaToppingsEntity,Long> {
    @Query("select e from ConnectionPizzaAndPizzaToppingsEntity e where e.idInformationAboutOrder=:id_order")
    ConnectionPizzaAndPizzaToppingsEntity getByIdOrder(@Param("id")Long id);
}
