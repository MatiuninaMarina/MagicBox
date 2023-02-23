import java.util.Random;
public class MagicBox <T> {
    protected T item;
    protected T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i ++ ) {
            if (items [i] == null) {
                items [i] = item;
                return true;
            }
        }
        return false;
    }
    public T pick() {
        int x = 0;
        for (T i : items) {
            if (i == null) {
                x++;
            }
        }
        for (T i : items) {
            if (i == null) {
                throw new RuntimeException("Коробка неполная и осталось еще " + x  + " ячеек заполнить");
                }
            }
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
        return items [randomInt];
    }
    }





