package smartthings.dw.asynchttpclient;

import java.util.HashMap;
import java.util.Map;

public class AsyncHttpClientConfig {

    private DatadogReporterConfig datadogReporterConfig;

	private Map<String, Object> properties = new HashMap<>();

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

    public DatadogReporterConfig getDatadogReporterConfig() {
        return datadogReporterConfig;
    }

    public void setDatadogReporterConfig(DatadogReporterConfig datadogReporterConfig) {
        this.datadogReporterConfig = datadogReporterConfig;
    }
}
