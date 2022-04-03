package com.kafka.kafkapubsubjava.okhttp;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetTelegram {
    final OkHttpClient client = new OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        GetTelegram example = new GetTelegram();
        String response = example.run("https://api.telegram.org/bot281761192:AAE7h61HIio8eviXggpssYHrJJ58nHWT32A/sendMessage?chat_id=173075344&text=Hello");
        System.out.println(response);
    }
}
