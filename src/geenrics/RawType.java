package geenrics;

public class RawType<E> {
    private E Item;

    public void setItem(E item) {
        this.Item = item;
    }
    /* RawType muammosi xoxlagan turdagi malumotni qabul qiladi va compile time warning beradi
    bundan qutilish uchun */
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        RawType rawType = new RawType();
        rawType.setItem("123");
        System.out.println(rawType);
    }
}
