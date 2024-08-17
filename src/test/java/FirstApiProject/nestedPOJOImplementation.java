package FirstApiProject;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
public class nestedPOJOImplementation {

    @Test
    public void implementNestedPOJO() throws JsonProcessingException {
       encryptInfo encyinfoclass =new encryptInfo();

        encyinfoclass.setencryptedData("Sample encrypted data");
        encyinfoclass.setkeyType("RSA");
        encyinfoclass.setkeyversion(18002);
        encyinfoclass.setkeyName("Test");
        encyinfoclass.setdivision("TEST");
        encyinfoclass.setCstoreNbr(166);
        encyinfoclass.setpopulatedFromAesInfo(false);

        proxyWrapper finalPojo = new proxyWrapper();
        finalPojo.setcitiEnvelope("Sample Text");
        finalPojo.setentryMode("Testdata");
        finalPojo.settraceId("Test/SITE/01.000.0000 TEST 166 Reg 999 Tran 5");

        finalPojo.setencrptdata(encyinfoclass);
        proxyWrapper last = new proxyWrapper();
        finaljsonpayload finaljson= new finaljsonpayload();
        finaljson.setproxyWrapper(finalPojo);
        ObjectMapper objectMapper = new ObjectMapper();
        String nestedJsonPayload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(finaljson);
        System.out.println(nestedJsonPayload);


    }


}
