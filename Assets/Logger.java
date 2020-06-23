package ga.matthewtgm.assets;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public void info(String msg) {
        System.out.println("[" + dtf.format(now) + "] [Application Thread/INFO] " + msg);
    }

    public void error(String msg) {
        System.out.println("[" + dtf.format(now) + "] [Application Thread/ERROR] " + msg);
    }
}
