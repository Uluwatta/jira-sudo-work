package ut.org.uluwatta.atlassian.plugins.sudowork.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.uluwatta.atlassian.plugins.sudowork.rest.SudoWorkRestResource;
import org.uluwatta.atlassian.plugins.sudowork.rest.SudoWorkRestResourceModel;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

public class SudoWorkRestResourceTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        SudoWorkRestResource resource = new SudoWorkRestResource();

        Response response = resource.getMessage();
        final SudoWorkRestResourceModel message = (SudoWorkRestResourceModel) response.getEntity();

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
