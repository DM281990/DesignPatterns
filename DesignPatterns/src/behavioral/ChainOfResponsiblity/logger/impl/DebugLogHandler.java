package behavioral.ChainOfResponsiblity.logger.impl;

import behavioral.ChainOfResponsiblity.logger.LogEntry;
import behavioral.ChainOfResponsiblity.logger.LogHandler;


public class DebugLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void handleLog(LogEntry log) {
        if (log.getSeverity().equals("DEBUG")) {
            System.out.println("DEBUG: " + log.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleLog(log);
        }
    }

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
