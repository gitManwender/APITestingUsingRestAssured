package FirstApiProject;

public class proxyWrapper {

    private String citiEnvelope;
    private  encryptInfo proxyWrapper;

    private String entryMode;
    private String traceId;




    public String getcitiEnvelope() {
        return citiEnvelope;
    }
    public void setcitiEnvelope(String citiEnvelope) {
        this.citiEnvelope = citiEnvelope;
    }


    public encryptInfo getencrptdata() {
        return proxyWrapper;
    }
    public void setencrptdata(encryptInfo proxyWrapper) {
        this.proxyWrapper = proxyWrapper;
    }


    public String getentryMode() {
        return entryMode;
    }
    public void setentryMode(String entryMode) {
        this.entryMode = entryMode;
    }


    public String gettraceId() {
        return traceId;
    }
    public void settraceId(String traceId) {
        this.traceId = traceId;
    }

}
