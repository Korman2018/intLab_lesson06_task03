package task03;

import java.lang.reflect.Method;
import java.util.Arrays;

import static task03.Constants.CLASS_NAME;
import static task03.Constants.LOGGER;

public class Runner {
    public static void main(String[] args) {
        LOGGER.info("Object of class:{}\n", CLASS_NAME);

        try {
            Class clazz = Class.forName(CLASS_NAME);
            Entity entity = (Entity) clazz.newInstance();
            Method[] methods = entity.getClass().getDeclaredMethods();
            LOGGER.info("Methods:\n");

            for (Method m : methods) {
                Arrays.stream(m.getDeclaredAnnotations()).forEach(x->LOGGER.info(x.toString()));
                LOGGER.info("{}\n", m.toGenericString());
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            LOGGER.error("Catch exception", e);
        }
    }
}
