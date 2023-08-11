package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;


/**
 * @apiNote Logger осуществляет логирование действий пользователя

 */

public class Logger {

    private static FileWriter logFile;


    public Logger() {
        try{
            logFile = new FileWriter("finalTask1/log.txt");
        } catch (IOException e) {
            System.out.println("Message" + e.getMessage());

       }
    }

    public void logStep(String message) {
        try{
            logFile.write(new Timestamp(System.currentTimeMillis())+ " " + message + "\n");
            logFile.flush();

        } catch (IOException e) {
            System.out.println("Message" + e.getMessage());
        }

    }
}


