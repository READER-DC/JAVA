public class Pen {

    private int inkAmount;
    private int inkCapacity;

    public Pen (){
        this.inkCapacity = 4096;
        this.inkAmount = inkCapacity;
    }

    public Pen (int inkCapacity ){
        this.inkCapacity = inkCapacity;
        this.inkAmount = inkCapacity;
    }

    int getInkAmount() {
        return inkAmount;
    }
    int getInkCapacity() {
        return inkCapacity;
    }

    void write(Paper paper, String message) throws OutOfInk, OutOfSpace {
    if ( inkAmount <= 0 ) {
        throw new OutOfInk();
    }

    if ( message.length() >= this.inkAmount ) {
        paper.addContent(message.substring(0, inkAmount));
        inkAmount = 0;
    } else {
        paper.addContent(message);
        inkAmount -= message.length();
    }

    }
    void refill(){
        inkAmount = inkCapacity;
    }
}

