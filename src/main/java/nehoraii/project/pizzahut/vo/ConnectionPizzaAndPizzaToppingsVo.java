package nehoraii.project.pizzahut.vo;

import lombok.Data;

import java.io.Serializable;
@Data

public class ConnectionPizzaAndPizzaToppingsVo implements Serializable {
    private boolean leftPizzaTopping;
    private boolean rightPizzaTopping;
    private long idInformationAboutOrder;
    private long idInformationAboutPizzaToppings;
    private long idInformationAboutTheItems;
}
