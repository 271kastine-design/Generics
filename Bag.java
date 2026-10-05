public class Bag<T> {
    private T item;

    public Bag() {
    }
    public void addItem(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
}
