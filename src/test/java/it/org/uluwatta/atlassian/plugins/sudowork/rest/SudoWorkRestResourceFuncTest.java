package it.org.uluwatta.atlassian.plugins.sudowork.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.uluwatta.atlassian.plugins.sudowork.rest.SudoWorkRestResource;
import org.uluwatta.atlassian.plugins.sudowork.rest.SudoWorkRestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class SudoWorkRestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/sudowork/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        SudoWorkRestResourceModel message = resource.get(SudoWorkRestResourceModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
