package com.example.myfragmentmvp.Models;

import android.content.Context;

import com.example.myfragmentmvp.HelpersServices.HelpersService;
import com.loopj.android.http.JsonHttpResponseHandler;

public class Alumno {
    public static void getAlumnos(Context con, JsonHttpResponseHandler JsonHttpResponseHandler){
        HelpersService.getAllUsers(con,new JsonHttpResponseHandler(){

        });
    }

    public static void getAlumno(Context con,String id){
        HelpersService.getUser(id,new JsonHttpResponseHandler(){

        });
    }
}
