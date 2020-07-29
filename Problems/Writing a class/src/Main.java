class Shelf<T extends Book> {
    private T t;
    public void setElement(T t) {
        this.t = t;
    }
    public T getElement() {
        return t;
    }
}