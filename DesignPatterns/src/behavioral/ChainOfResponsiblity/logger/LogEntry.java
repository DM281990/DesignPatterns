package behavioral.ChainOfResponsiblity.logger;

public class LogEntry {
    private String message;
    private String severity;

    public LogEntry(String message, String severity) {
        this.message = message;
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public String getSeverity() {
        return severity;
    }
}