package hw18;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class StoreApiTest {
    private StoreApi storeApi;

    @BeforeClass
    public void setUp() {
        storeApi = new StoreApi();
    }
    @Test(priority = 1)
    public void testGetInventory() throws IOException {
        JSONObject jsonObject = new JSONObject(storeApi.getInventory().body().string());
        int availableItems = jsonObject.getInt("availableItems");
        Assert.assertTrue(availableItems > 0, "There should be available items in the inventory");
    }
    @Test(priority = 2)
    public void testCreateOrder() throws IOException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 10);
        requestBody.put("petId", 198772);
        requestBody.put("quantity", 7);
        requestBody.put("status", "approved");
        requestBody.put("complete", "true");

        JSONObject jsonObject = new JSONObject(storeApi.createOrder(requestBody.toString()).body().string());
        int orderId = jsonObject.getInt("id");
        Assert.assertNotNull(orderId, "Order ID should not be null");
    }
    @Test(priority = 3)
    public void testGetOrderById() throws IOException {
        int orderId = 10;
        JSONObject jsonObject = new JSONObject(storeApi.getOrderById(orderId).body().string());
        int retrievedOrderId = jsonObject.getInt("id");
        Assert.assertEquals(retrievedOrderId, orderId, "Retrieved order ID should match the requested order ID");
    }
    @Test(priority = 4)
    public void testDeleteOrder() throws IOException {
        int orderId = 10;
        int statusCode = storeApi.deleteOrder(orderId).code();
        Assert.assertEquals(statusCode, 200, "Order deletion should return status code 200");

        statusCode = storeApi.getOrderById(orderId).code();
        Assert.assertEquals(statusCode, 404, "Deleted order retrieval should return status code 404");
    }
}


