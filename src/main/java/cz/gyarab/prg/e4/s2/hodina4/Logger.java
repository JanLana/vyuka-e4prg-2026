package cz.gyarab.prg.e4.s2.hodina4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger singletonInstance;
    private Logger() {
        n = 1;
        //formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    public static Logger getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Logger();
        }
        return singletonInstance;
    }
    //------------------------

    private int n;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public void debug(String msg) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.printf("[%s] [#%03d]: %s%n", timestamp, n++, msg);
    }
}
