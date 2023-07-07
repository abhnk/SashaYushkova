package hw18;
import okhttp3.*;

import java.io.IOException;
public class StoreApi {
    private static final String BASE_URL = "https://petstore3.swagger.io/api/v3";

    private OkHttpClient client;
    private MediaType mediaType;

    public StoreApi() {
        client = new OkHttpClient();
        mediaType = MediaType.parse("application/json");
    }

    public Response getInventory() throws IOException {
        String url = BASE_URL + "/store/inventory";
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        return client.newCall(request).execute();
    }

    public Response createOrder(String requestBody) throws IOException {
        String url = BASE_URL + "/store/order";
        RequestBody body = RequestBody.create(mediaType, requestBody);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        return client.newCall(request).execute();
    }

    public Response getOrderById(int orderId) throws IOException {
        String url = BASE_URL + "/store/order/" + orderId;
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        return client.newCall(request).execute();
    }

    public Response deleteOrder(int orderId) throws IOException {
        String url = BASE_URL + "/store/order/" + orderId;
        Request request = new Request.Builder()
                .url(url)
                .delete()
                .build();
        return client.newCall(request).execute();
    }
}