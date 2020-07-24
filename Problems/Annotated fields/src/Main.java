
/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        java.util.List<String> list = new java.util.ArrayList<>();

        Class aClass = object.getClass();
        java.lang.reflect.Field[] declaredFields = aClass.getDeclaredFields();
        for (java.lang.reflect.Field f : declaredFields) {
            java.lang.annotation.Annotation[] declaredAnnotations = f.getDeclaredAnnotations();
            if (declaredAnnotations.length > 0) {
                list.add(f.getName());
            }

        }
        return list.toArray(new String[0]);

    }

}
