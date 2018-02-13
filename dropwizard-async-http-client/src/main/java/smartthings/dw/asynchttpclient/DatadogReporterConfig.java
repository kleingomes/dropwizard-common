package smartthings.dw.asynchttpclient;

public class DatadogReporterConfig {

    private Boolean isEnabled;

    private int pollPeriodInSeconds;

    private String appName;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        this.isEnabled = enabled;
    }

    public int getPollPeriodInSeconds() {
        return pollPeriodInSeconds;
    }

    public void setPollPeriodInSeconds(int pollPeriodInSeconds) {
        this.pollPeriodInSeconds = pollPeriodInSeconds;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
