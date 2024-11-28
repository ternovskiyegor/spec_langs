package task2;

public class Main {

    public static void main(String[] args) throws Exception {
        MyStack<Integer> list = new MyStack<>();
        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list);
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.copy(list);
        stack2.push(4);
        stack2.push(5);
        stack2.push(9);
        System.out.println("Stack 1" + list);
        System.out.println("Stack 2" + stack2);
        System.out.println("Getting element from stack 2: " + stack2.pop());
        stack2.push(11);
        System.out.println("Stack 2" + stack2);

        MyStack<Integer> stack3 = new MyStack<>(stack2);

        System.out.println("Stack 2" + stack2);
        stack3.push(81);
        System.out.println("Stack 3" + stack3);

        System.out.println(stack2.hashCode());
        System.out.println(stack3.hashCode());
        System.out.println(stack2.equals(stack3));

        System.out.println();

        MyStack<Integer> t1 = new MyStack<>();
        MyStack<Integer> t2 = new MyStack<>();
        System.out.println(t1.equals(t2));
        t1.push(1);
        t2.push(1);
        System.out.println(t1.equals(t2));

    }
}
