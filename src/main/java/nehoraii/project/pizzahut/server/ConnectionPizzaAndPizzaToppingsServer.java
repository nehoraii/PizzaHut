package nehoraii.project.pizzahut.server;

import nehoraii.project.pizzahut.classUpdate.ConnectionPizzaAndPizzaToppingsUpdate;
import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import nehoraii.project.pizzahut.repository.ConnectionPizzaAndPizzaToppingsRepository;
import nehoraii.project.pizzahut.vo.ConnectionPizzaAndPizzaToppingsVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void update(Long id, ConnectionPizzaAndPizzaToppingsUpdate update){
        ConnectionPizzaAndPizzaToppingsEntity bean=requireOne(id);
        BeanUtils.copyProperties(update,bean);
        connectionPizzaAndPizzaToppingsRepository.save(bean);
    }
    public ConnectionPizzaAndPizzaToppingsVo getByIdForVo(Long id){
        ConnectionPizzaAndPizzaToppingsEntity original=requireOne(id);
        return toVO(original);
    }
    public ConnectionPizzaAndPizzaToppingsUpdate getByIdForUpdate(Long Id){
        ConnectionPizzaAndPizzaToppingsEntity original=requireOne(Id);
        return toUpdate(original);
    }
    private ConnectionPizzaAndPizzaToppingsVo toVO(ConnectionPizzaAndPizzaToppingsEntity original){
        ConnectionPizzaAndPizzaToppingsVo bean=new ConnectionPizzaAndPizzaToppingsVo();
        BeanUtils.copyProperties(original,bean);
        return bean;
    }
    private ConnectionPizzaAndPizzaToppingsUpdate toUpdate(ConnectionPizzaAndPizzaToppingsEntity original){
        ConnectionPizzaAndPizzaToppingsUpdate bean=new ConnectionPizzaAndPizzaToppingsUpdate();
        BeanUtils.copyProperties(original,bean);
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
    public ConnectionPizzaAndPizzaToppingsEntity getEntityByVo(ConnectionPizzaAndPizzaToppingsVo Vo) throws IllegalAccessException {
        Long idOrder=Vo.getIdInformationAboutOrder();
        Long idItems=Vo.getIdInformationAboutTheItems();
        Long idOrderTopping=Vo.getIdInformationAboutPizzaToppings();
        boolean left=Vo.isLeftPizzaTopping();
        boolean right=Vo.isRightPizzaTopping();
        ConnectionPizzaAndPizzaToppingsEntity entityByVo = connectionPizzaAndPizzaToppingsRepository.getEntityByVo(idOrder, idOrderTopping, idItems, left, right);
        if(entityByVo==null){
            throw new IllegalAccessException("not found");
        }
        return entityByVo;
    }

}
