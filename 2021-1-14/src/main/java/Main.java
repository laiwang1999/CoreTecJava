public class Main {
}

enum Size {
    SMALL("S"), MEDIUM("M");

    private Size(String s) {
        this.s = s;
    }
    public String getS(){
        return s;
    }

    private String s;
}
