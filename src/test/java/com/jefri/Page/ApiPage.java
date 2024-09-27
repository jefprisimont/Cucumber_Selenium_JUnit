package com.jefri.Page;

import com.jefri.Helper.Endpoint;
import com.jefri.Helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import java.io.File;

import static com.jefri.Helper.Models.sendApiRequest;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.*;

public class ApiPage {

    private static Response res;

    String setURL;

    public String sendURL(String url) {
        switch (url) {
            case "ClientURL":
                setURL = Endpoint.ClientURL;
                break;
            case "getInvalidID":
                setURL = Endpoint.getInvalidID;
                break;
            default:
                System.out.println("input right url");

        }
        return setURL;
    }

    public void sendTheRequest() {
        res = sendApiRequest(setURL);
    }

    public void validateStatusCode(int status_Code) {
        assertThat(res.statusCode()).isEqualTo(status_Code);
        System.out.println(res.getStatusCode());
    }

    public void validateResponseBody() {
        int id = res.jsonPath().getInt("data.id");
        String firstName = res.jsonPath().getString("data.first_name");
        String lastName = res.jsonPath().getString("data.last_name");
        String email = res.jsonPath().getString("data.email");
        String avatar = res.jsonPath().getString("data.avatar");

        System.out.println(res.getBody().asString());
        assertThat(id).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(avatar).isNotNull();
    }

    public void validateJSONSchema (String fileName) {
        File JSONFile = Utility.getJSONSchemaFile(fileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

}
