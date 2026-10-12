package cz.gyarab.prg.e4.s1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger singletonInstance;
    private Logger() {
        pocitadlo = 1;
    }

    public static Logger getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Logger();
        }
        return singletonInstance;
    }


    int pocitadlo;

    public void debug(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        System.out.printf("[%s] [#%03d]: %s%n", timestamp, pocitadlo, msg);
        //System.out.println(msg);
        pocitadlo++;
    }
}
