package chapter_13;

public class _03_Product<T,M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }
    public M getModel() {
        return this.model;
    }

    public void setKind(T kind){
        this.kind = kind;
    }
    public void setModel(M model) {
        this.model = model;
    }
}
