public class InvalidDate extends Exception {
    public String text;
    InvalidDate(String text) {
        // System.out.println(text);
        this.text = text;
    }

}