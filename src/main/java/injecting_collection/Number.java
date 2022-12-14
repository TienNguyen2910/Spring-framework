package injecting_collection;

public class Number {
    private int num;

    public int getNum() {
        System.out.println("Get num : "+ num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
