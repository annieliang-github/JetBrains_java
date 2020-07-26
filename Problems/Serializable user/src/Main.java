import java.io.Serializable;

class User implements Serializable{
    private static final long serialVersionUID = 3L;
    String name;
    transient String password;

}