package com.example.linzie.wheretoeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.AlertDialog;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.REGISTERetName);
        final EditText etUsername = (EditText) findViewById(R.id.REGISTERetUsername);
        final EditText etAge = (EditText) findViewById(R.id.REGISTERetAge);
        final EditText  etPassword = (EditText) findViewById(R.id.REDISTERetPassword);
        final Button bRegister = (Button) findViewById(R.id.REGISTERbottonRegister);
        final EditText etaboutme = (EditText) findViewById(R.id.etAboutme);
        final EditText etmail = (EditText) findViewById(R.id.etEMail);


        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                final String name = etName.getText().toString();
                final String username = etUsername.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());
                final String password = etPassword.getText().toString();
                final String aboutme = etaboutme.getText().toString();
                final String email = etmail.getText().toString();


                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Register.this, LoginActivity.class);
                                Register.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name, username, age, password,aboutme,email, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Register.this);
                queue.add(registerRequest);
            }
        });
    }
}