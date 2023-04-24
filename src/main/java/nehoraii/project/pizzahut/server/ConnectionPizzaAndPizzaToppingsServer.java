package nehoraii.project.pizzahut.server;

import nehoraii.project.pizzahut.entity.ConnectionPizzaAndPizzaToppingsEntity;
import nehoraii.project.pizzahut.repository.ConnectionPizzaAndPizzaToppingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class ConnectionPizzaAndPizzaToppingsServer {
    @Autowired
    private ConnectionPizzaAndPizzaToppingsRepository connectionPizzaAndPizzaToppingsRepository;
    public ConnectionPizzaAndPizzaToppingsServer(ConnectionPizzaAndPizzaToppingsRepository connectionPizzaAndPizzaToppingsRepository){
        this.connectionPizzaAndPizzaToppingsRepository=connectionPizzaAndPizzaToppingsRepository;
    }

}
