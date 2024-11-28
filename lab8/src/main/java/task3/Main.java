package task3;

public class Main {

    public static void main(String[] args) {
        MyStack<Number> stN = new MyStack<>();
        MyStack<Integer> stI = new MyStack<>();
        MyStack<Double> stD = new MyStack<>();
        for (int i = 0; i < 3; i++) {
            stI.push( Integer.valueOf( i ) );
            stD.push( Double.valueOf( i + 1) );
        }
        System.out.println("Integer stack: " + stI);
        System.out.println("Double stack: " + stD);
        MyStack<Double> stD2 = new MyStack<>(stD);
        stD.push(Double.valueOf(4));
        System.out.println("Double stack: " + stD);
        System.out.println("Double2 stack: " + stD2);
        stN.copy(stI);
        System.out.println("Number stack: " + stN);
        stN.addAll(stI);
        System.out.println("Integer stack: " + stI);
        System.out.println("Number stack: " + stN);
    }
}
