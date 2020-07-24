
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here
        List<String> list = new ArrayList<>();

        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field f : declaredFields) {
            int modifier = f.getModifiers();
            if (Modifier.isPublic(modifier)) {
                list.add(f.getName());
            }
        }
        return list.toArray(new String[0]);

    }

}