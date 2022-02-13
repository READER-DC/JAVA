class Paper {
    private int maxSymbols;
    private int symbols;
    private StringBuffer content;

    public Paper() {
        this.maxSymbols = 4096;
        content = new StringBuffer();
    }

    public Paper(int maxSymbols) {
        this.maxSymbols = maxSymbols;
        content = new StringBuffer();
    }

        int getMaxSymbols() {
            return maxSymbols;
        }
        int getSymbols() {
            return symbols;
        }

    void addContent(String message) throws OutOfSpace {
        int futureContent = this.symbols + message.length();

        if ( symbols >= this.maxSymbols ) {
            throw new OutOfSpace();
        }
    
        if ( futureContent > this.maxSymbols ) {
            content.append(message.substring(0, maxSymbols-content.length()));
            return;
        } 
        content.append(message);
    }

    void show() {
        System.out.println(content);
    }
}
