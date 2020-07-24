import java.lang.reflect.Constructor;

/**
 Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        // Add implementation here
        boolean res = false;
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            Class[] parameterTypes = c.getParameterTypes();
            if (parameterTypes.length == 0) {
                res = true;
            }
        }
        return res;
    }

}