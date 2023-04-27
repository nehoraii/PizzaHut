package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

public interface ConnectionPizzaAndPizzaToppingsRepository extends JpaRepository<ConnectionPizzaAndPizzaToppingsEntity,Long> {
    @Query("select e from ConnectionPizzaAndPizzaToppingsEntity e where e.idInformationAboutOrder=:id_order")
    ConnectionPizzaAndPizzaToppingsEntity getByIdOrder(@Param("id")Long id);
    @Query("select e from ConnectionPizzaAndPizzaToppingsEntity e WHERE  e.idInformationAboutOrder=:idOrder and e.idInformationAboutPizzaToppings=:idTopping and e.idInformationAboutTheItems=:iditems and e.leftPizzaTopping=:left and e.rightPizzaTopping=:right")
    ConnectionPizzaAndPizzaToppingsEntity getEntityByVo(@Param("idOrder")Long idOrder,@Param("idTopping")Long IdTopping,@Param("iditems")Long iditems,@Param("left")boolean left,@Param("right")boolean right );

}