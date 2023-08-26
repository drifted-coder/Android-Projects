package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAqA1rnlE:APA91bENANJoFgprC_X5Pt9jr1RECM6UM8qRGJcACmqWGpslxcpFpsipdBi1RQJPk9HJ6DWv1W6uV6B-NgGuoXAKXsvYNfzZvRK9jDoOcs3BoV2rfoMznX7oqIXDTTUwbCjv6V4EFtLo"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
