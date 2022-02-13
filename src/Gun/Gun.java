public class Gun {
    private int amount = 0;
    private int capacity;
    private boolean isReady = false;
    private String model;
    private int totalShots = 0;
    
    public Gun(){
        this.model = "Beretta";
        this.capacity = 8;
    }

    public Gun(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }

    int getAmount() {
        return amount;

    }
    int getCapacity() {
        return capacity;
    }
    boolean ready() {
        return isReady;
    }
    String getModel() {
        return model;
    }
    int getTotalShots() {
        return totalShots;
    }

    void prepare(){
        this.isReady = !this.isReady;
    }
    void reload(){
        this.amount = this.capacity;

    }
    void shoot() throws NotReady, OutOfRounds{
        if ( !ready() ) {
            throw new NotReady();
        }
        if ( amount == 0 ){
            throw new OutOfRounds();
        }
        System.out.println("Bang!");
        this.amount -= 1;
        this.totalShots += 1;
    }

    public String toString() {
        return  "    Model: "  + model +
                "    Amount: " + amount +
                "    Capacity:" + capacity +
                "    Total shots: " + totalShots;
    }
}
