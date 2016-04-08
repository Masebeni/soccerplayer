package com.mobileBanking;

import com.mobileBanking.domain.Client;
import com.mobileBanking.factories.Client.ClientFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClient {

    Client client;

    @Test
    public void testNullness() throws Exception {
        client = new Client.Builder()
                .name("Siya")
                .build();
        Assert.assertNotNull(client);
    }

    @Test
    public void testData() throws Exception {
        client = new Client.Builder()
                .cellNumber("316")
                .build();
        Assert.assertEquals(client.getCellNumber(), "316");
    }

    @Test
    public void testExisits() throws Exception {
        Assert.assertNotNull(ClientFactoryImpl.getInstance());
    }

    @Test
    public void testOutput() throws Exception {
        client  = new ClientFactoryImpl().createClient("1", "1");
        Assert.assertEquals(client.getName(), "Siya");
    }
}
