public class Logger {
    private static volatile Logger instance;
    private Logger() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created. Use getInstance() method.");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
