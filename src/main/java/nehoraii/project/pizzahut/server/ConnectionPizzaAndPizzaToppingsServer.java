package nehoraii.project.pizzahut.server;

import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import nehoraii.project.pizzahut.repository.ConnectionPizzaAndPizzaToppingsRepository;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
import nehoraii.project.pizzahut.vo.EmployeesVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ConnectionPizzaAndPizzaToppingsServer {
    @Autowired
    private ConnectionPizzaAndPizzaToppingsRepository connectionPizzaAndPizzaToppingsRepository;
    public ConnectionPizzaAndPizzaToppingsServer(ConnectionPizzaAndPizzaToppingsRepository connectionPizzaAndPizzaToppingsRepository){
        this.connectionPizzaAndPizzaToppingsRepository=connectionPizzaAndPizzaToppingsRepository;
    }

    public Long save(ConnectionPizzaAndPizzaToppingsVo Vo){
        ConnectionPizzaAndPizzaToppingsEntity bean=new ConnectionPizzaAndPizzaToppingsEntity();
        BeanUtils.copyProperties(Vo,bean);
        bean=connectionPizzaAndPizzaToppingsRepository.save(bean);
        return bean.getId();
    }
    public Long delete(Long id){
        connectionPizzaAndPizzaToppingsRepository.deleteById(id);
        return id;
    }
    public void update(Long id, ConnectionPizzaAndPizzaToppingsVo Vo){
        ConnectionPizzaAndPizzaToppingsEntity bean=requireOne(id);
        BeanUtils.copyProperties(Vo,bean);
        connectionPizzaAndPizzaToppingsRepository.save(bean);
    }
    public ConnectionPizzaAndPizzaToppingsVo getById(Long id){
        ConnectionPizzaAndPizzaToppingsEntity original=requireOne(id);
        return toVO(original);
    }
    private ConnectionPizzaAndPizzaToppingsVo toVO(ConnectionPizzaAndPizzaToppingsEntity orginal){
        ConnectionPizzaAndPizzaToppingsVo bean=new ConnectionPizzaAndPizzaToppingsVo();
        BeanUtils.copyProperties(orginal,bean);
        return bean;
    }
    private ConnectionPizzaAndPizzaToppingsEntity requireOne(Long id){
        return connectionPizzaAndPizzaToppingsRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("Resource not found " + id));
    }
    public List<ConnectionPizzaAndPizzaToppingsEntity> getAllConnectionByOrderID(Long orderId){
        ConnectionPizzaAndPizzaToppingsEntity list;
        list=connectionPizzaAndPizzaToppingsRepository.getByIdOrder(orderId);
        return (List<ConnectionPizzaAndPizzaToppingsEntity>) list;

    }
    public ConnectionPizzaAndPizzaToppingsEntity getEntityByVo(ConnectionPizzaAndPizzaToppingsVo Vo){
        Long idOrder=Vo.getIdInformationAboutOrder();
        Long idItems=Vo.getIdInformationAboutTheItems();
        Long idOrderTopping=Vo.getIdInformationAboutPizzaToppings();
        boolean left=Vo.isLeftPizzaTopping();
        boolean right=Vo.isRightPizzaTopping();
        return connectionPizzaAndPizzaToppingsRepository.getEntityByVo(idOrder,idOrderTopping,idItems,left,right);
    }

}
