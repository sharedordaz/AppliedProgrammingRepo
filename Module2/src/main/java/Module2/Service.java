package Module2;

public class Service{
    private String name;
    private int cost;
    private boolean paid;
    //Constructor
    public Service(String name, int cost, Boolean paid){
        this.name = name;
        this.cost = cost;
        this.paid = paid;
    }
      // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
    
