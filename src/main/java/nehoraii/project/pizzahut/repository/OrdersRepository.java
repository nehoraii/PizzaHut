package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrdersEntity,Long> {
}
