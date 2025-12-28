package structuralDesignPattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RobotFactory {

    private static final Map<String, RobotIF> cache = new ConcurrentHashMap<>();

    public static RobotIF getRobot(String key) {
        if (cache.containsKey(key)) return cache.get(key);

        RobotIF robot;
        switch (key) {
            case "HumanBot":
                System.out.println("Caching HumanBot");
                robot = new HumanBot("HumanBot", new Sprite());
                break;
            case "DoggeshR":
                System.out.println("Caching DoggeshR");
                robot = new DoggeshR("DoggeshR", new Sprite());
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + key);
        }

        cache.put(key, robot);
        return robot;
    }
}
