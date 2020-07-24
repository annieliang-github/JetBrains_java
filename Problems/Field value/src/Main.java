import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Object obj = null;
        Class<?> aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields) {
            f.setAccessible(true);
            if (fieldName.equals(f.getName()) && Modifier.isPublic(f.getModifiers())) {
                obj = f.get(object);
            }
        }
        return obj;

    }

}