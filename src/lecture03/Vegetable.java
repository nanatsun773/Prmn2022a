package lecture03;

public class Vegetable {
    private String name;
    private int value;

    public Vegetable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void print() {
        System.out.println(name + "は" + value + "円");
    }
}
