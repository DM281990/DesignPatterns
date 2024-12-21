package behavioral.ChainOfResponsiblity.logger.impl;

import behavioral.ChainOfResponsiblity.logger.LogEntry;
import behavioral.ChainOfResponsiblity.logger.LogHandler;

public class InfoLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLog(LogEntry log) {
        if (log.getSeverity().equals("INFO")) {
            System.out.println("INFO: " + log.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleLog(log);
        }
    }

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
