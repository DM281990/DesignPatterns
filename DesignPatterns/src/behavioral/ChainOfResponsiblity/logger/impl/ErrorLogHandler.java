package behavioral.ChainOfResponsiblity.logger.impl;

import behavioral.ChainOfResponsiblity.logger.LogEntry;
import behavioral.ChainOfResponsiblity.logger.LogHandler;

public class ErrorLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLog(LogEntry log) {
        if (log.getSeverity().equals("ERROR")) {
            System.out.println("ERROR: " + log.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleLog(log);
        }
    }

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
