package FirstApiProject;

public class encryptInfo {

    private String encryptedData;
    private String keyType;
    private int keyVersion;
    private String keyName;
    private String division;
    private int storeNbr;
    private Boolean populatedFromAesInfo;




    public String getencryptedData() {
        return encryptedData;
    }
    public void setencryptedData(String encrypdata) {
        this.encryptedData = encrypdata;
    }


    public String getkeyType() {
        return keyType;
    }
    public void setkeyType(String keytype) {
        this.keyType = keytype;
    }




    public int getkeyVersion() {
        return keyVersion;
    }
    public void setkeyversion(int keyversion) {
        this.keyVersion = keyversion;
    }

    public String getkeyName() {
        return keyName;
    }
    public void setkeyName(String keyName) {
        this.keyName = keyName;
    }


    public String getdivision() {
        return division;
    }
    public void setdivision(String division) {
        this.division = division;
    }




    public int getstoreNbr() {
        return storeNbr;
    }
    public void setCstoreNbr(int storeNbr) {
        this.storeNbr = storeNbr;
    }

    public Boolean getpopulatedFromAesInfo() {
        return populatedFromAesInfo;
    }
    public void setpopulatedFromAesInfo(Boolean populatedFromAesInfo) {
        this.populatedFromAesInfo = populatedFromAesInfo;
    }


}
