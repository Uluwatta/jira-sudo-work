package ut.org.uluwatta.atlassian.plugins.sudowork;

import org.junit.Test;
import org.uluwatta.atlassian.plugins.sudowork.api.MyPluginComponent;
import org.uluwatta.atlassian.plugins.sudowork.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}