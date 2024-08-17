package FirstApiProject;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class requestBuilder {
    public static void main(String[] args) {
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();

        reqBuilder.setBaseUri("https://reqres.in/api/users/2");

        RequestSpecification reqSpec = reqBuilder.build();

        Response res1 = reqSpec.get();

        String res = res1.asPrettyString();
        System.out.println(res);
    }

}