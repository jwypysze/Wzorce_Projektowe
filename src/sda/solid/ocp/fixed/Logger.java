package sda.solid.ocp.fixed;

public class Logger {
    private MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    /** Teraz mamy ogólną metodę log która będzie przekazywac komunikaty które chcemy napisac do zainicjowanego
     * w konstruktorze loggera
     */

    public void log(String message) throws Exception{
        messageLogger.log(message);
    }
}
