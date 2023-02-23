public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(3);
        MagicBox<Integer> magicBox1 = new MagicBox<>(2);
        magicBox.add("Hello");
        magicBox.add("Thanks");
        magicBox.add("Bye");
        magicBox1.add(7);
        magicBox1.add(5);

        magicBox.pick();
        magicBox1.pick();


    }
}