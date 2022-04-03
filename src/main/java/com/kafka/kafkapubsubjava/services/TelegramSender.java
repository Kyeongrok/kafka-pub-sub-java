package com.kafka.kafkapubsubjava.services;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TelegramSender {
    final OkHttpClient client = new OkHttpClient();
    final String API_ADDR = "https://api.telegram.org/bot281761192:AAE7h61HIio8eviXggpssYHrJJ58nHWT32A/sendMessage?chat_id=173075344&text=";

    public String send(String message) throws IOException {
        Request request = new Request.Builder()
                .url(API_ADDR + message)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


}
