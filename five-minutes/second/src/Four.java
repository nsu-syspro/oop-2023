public class Four {

    MyInt[] arr = new MyInt[4];

    public static void main(String[] args) {
        Four four = new Four();
        four.arr[0].i = 42;
        System.out.println(four.arr[0].i);
    }
}

class MyInt {
    int i;
}
