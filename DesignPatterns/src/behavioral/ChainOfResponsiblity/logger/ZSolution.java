package behavioral.ChainOfResponsiblity.logger;

import behavioral.ChainOfResponsiblity.logger.impl.DebugLogHandler;
import behavioral.ChainOfResponsiblity.logger.impl.ErrorLogHandler;
import behavioral.ChainOfResponsiblity.logger.impl.InfoLogHandler;

public class ZSolution {
    public static void main(String[] args) {
        InfoLogHandler infoHandler = new InfoLogHandler();
        DebugLogHandler debugHandler = new DebugLogHandler();
        ErrorLogHandler errorHandler = new ErrorLogHandler();

        // Set up the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create log entries
        LogEntry log1 = new LogEntry("This is an informational message.", "INFO");
        LogEntry log2 = new LogEntry("DEBUG: Potential issue detected.", "DEBUG");
        LogEntry log3 = new LogEntry("Error: Critical error occurred!", "ERROR");
        LogEntry log4 = new LogEntry("Debug: Debugging information.", "DEBUG");

        // Process the log entries
        infoHandler.handleLog(log1);
        infoHandler.handleLog(log2);
        infoHandler.handleLog(log3);
        infoHandler.handleLog(log4);
    }
}
