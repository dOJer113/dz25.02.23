public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> box1 = new MagicBox<Integer>(3);
        System.out.println(box1.add(88888888));
        System.out.println(box1.add(903909809));
        System.out.println(box1.add(1321231));
        System.out.println(box1.pick());
        MagicBox<String> box2 = new MagicBox<String>(4);
        System.out.println(box2.add("Ярослав"));
        System.out.println(box2.add("Полина"));
        System.out.println(box2.pick());
    }
}