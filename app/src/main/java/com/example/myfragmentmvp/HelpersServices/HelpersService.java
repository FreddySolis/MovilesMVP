package com.example.myfragmentmvp.HelpersServices;

import android.content.Context;

import com.example.myfragmentmvp.Enums.Enums;
import com.example.myfragmentmvp.Helpers.Helpers;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HelpersService {
    public static AsyncHttpClient client = new AsyncHttpClient();

    public static AsyncHttpClient getClientToken() {
        client.addHeader("Authorization","Token " + Helpers.token);
        client.addHeader("Content-Type","application/json");
        return client;
    }

    public static AsyncHttpClient getClient() {
        client.addHeader("Content-Type","application/json");
        return client;
    }

    public static  void getAllUsers(Context con,AsyncHttpResponseHandler asyncHttpResponseHandler){
        client.addHeader("Authorization","Token " + Helpers.token);
        client.get(con,Helpers.URL+ Enums.getAlumnos,asyncHttpResponseHandler);
    };

    public static  void getUser(String id,AsyncHttpResponseHandler asyncHttpResponseHandler){
        client.addHeader("Authorization","Token " + Helpers.token);
        client.get(Helpers.URL+ Enums.getAlumnos+id,asyncHttpResponseHandler);
    };

}

