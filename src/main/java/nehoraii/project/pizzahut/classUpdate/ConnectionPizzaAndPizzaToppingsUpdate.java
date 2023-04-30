package nehoraii.project.pizzahut.classUpdate;

public class ConnectionPizzaAndPizzaToppingsUpdate {
    private Long id;
    private long idInformationAboutTheItems;
    private long idInformationAboutPizzaToppings;
    private long idInformationAboutOrder;
    private boolean rightPizzaTopping;
    private boolean leftPizzaTopping;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdInformationAboutTheItems() {
        return idInformationAboutTheItems;
    }

    public void setIdInformationAboutTheItems(long idInformationAboutTheItems) {
        this.idInformationAboutTheItems = idInformationAboutTheItems;
    }

    public long getIdInformationAboutPizzaToppings() {
        return idInformationAboutPizzaToppings;
    }

    public void setIdInformationAboutPizzaToppings(long idInformationAboutPizzaToppings) {
        this.idInformationAboutPizzaToppings = idInformationAboutPizzaToppings;
    }

    public long getIdInformationAboutOrder() {
        return idInformationAboutOrder;
    }

    public void setIdInformationAboutOrder(long idInformationAboutOrder) {
        this.idInformationAboutOrder = idInformationAboutOrder;
    }

    public boolean isRightPizzaTopping() {
        return rightPizzaTopping;
    }

    public void setRightPizzaTopping(boolean rightPizzaTopping) {
        this.rightPizzaTopping = rightPizzaTopping;
    }

    public boolean isLeftPizzaTopping() {
        return leftPizzaTopping;
    }

    public void setLeftPizzaTopping(boolean leftPizzaTopping) {
        this.leftPizzaTopping = leftPizzaTopping;
    }


}
