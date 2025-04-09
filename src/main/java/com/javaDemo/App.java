package com.javaDemo;

import netscape.javascript.JSObject;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
        String str="{\"name\":\"Mary\"}";
        JSONObject jsonObject= new JSONObject(str);

        System.out.println("My Fist Project.My name is : "+jsonObject.get("name"));
    }
}
