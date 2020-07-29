import java.util.List;

class Box<T extends Animal> {
    private T t;

    void add(T t) {
        this.t = t;

    }
}

