package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

public interface ConnectionPizzaAndPizzaToppingsRepository extends JpaRepository<ConnectionPizzaAndPizzaToppingsEntity,Long> {
    @Query("select e from ConnectionPizzaAndPizzaToppingsEntity e where e.idInformationAboutOrder=:id_order")
    ConnectionPizzaAndPizzaToppingsEntity getByIdOrder(@Param("id_order")long id);
    @Query(nativeQuery = true, value = "select * from connection_pizza_and_pizza_toppings  WHERE  id_information_about_order=?1 and id_information_about_pizza_toppings=?2 and id_information_about_the_items=?3 and left_pizza_topping=?4 and right_pizza_topping=?5 limit 1")
    ConnectionPizzaAndPizzaToppingsEntity getEntityByVo(long idOrder,long IdTopping,long iditems,boolean left,boolean right);

}