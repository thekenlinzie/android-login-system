package com.example.linzie.wheretoeat;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LINZIE on 7/7/2017.
 */
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://10.0.2.2/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password,String aboutme,String email, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);
        params.put("aboutme", aboutme);
        params.put("email", email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}