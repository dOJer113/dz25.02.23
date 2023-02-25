public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> box1 = new MagicBox<Integer>(3);
        System.out.println(box1.add(88888888));
        System.out.println(box1.add(903909809));
        System.out.println(box1.add(1321231));
        System.out.println(box1.pick());
    }
}