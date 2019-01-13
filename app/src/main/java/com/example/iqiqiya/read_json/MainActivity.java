package com.example.iqiqiya.read_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonStr = "{\"name\":\"iqiqiya\",\"age\":18,\"arr\":[1,2,3,4,\"77sec\"]}";

        try {
            JSONObject jo = new JSONObject(jsonStr);
            //jo.get("name");
            String name = jo.getString("name");

            System.out.println(name);//读取json对象

            JSONArray arr = jo.getJSONArray("arr");
            int firstValue = arr.getInt(0);

            System.out.println(firstValue);//读取json数组
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}