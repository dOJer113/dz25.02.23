import java.util.Random;

public class MagicBox<T> {
    protected int size;
    T[] box;
    public MagicBox(int size){
        this.size = size;
        box = (T[]) new Object[size];
    }
    public boolean add(T item){
        for(int i=0;i<size;i++){
            if (box[i]==null){
                box[i]=item;
                return true;
            }
        }
        return false;
    }
    public T pick() throws RuntimeException{
        for(int i=0;i<size;i++){
            if(box[i]==null) {
                throw new RuntimeException("Осталось незаполненными ещё " + (size-i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(size-1);
        return box[randomInt];

    }
}
