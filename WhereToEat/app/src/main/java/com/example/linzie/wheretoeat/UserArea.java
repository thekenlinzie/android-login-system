package com.example.linzie.wheretoeat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class UserArea extends AppCompatActivity {

    // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();

    // Session Manager Class
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        // Session class instance
        session = new SessionManager(getApplicationContext());

        TextView lblName = (TextView) findViewById(R.id.session_name);
        TextView lblEmail = (TextView) findViewById(R.id.session_email);
        TextView iblPassword = (TextView) findViewById(R.id.session_password);



        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();

        /**
         * Call this function whenever you want to check user login
         * This will redirect user to LoginActivity is he is not
         * logged in
         * */
        session.checkLogin();

        // get user data from session
        HashMap<String, String> user = session.getUserDetails();

        // name
        String name = user.get(SessionManager.KEY_NAME);

        // email
        String email = user.get(SessionManager.KEY_EMAIL);

        // email
        String password = user.get(SessionManager.KEY_PASSWORD);

        // displaying user data
        lblName.setText(Html.fromHtml("Name: <b>" + name + "</b>"));
       lblEmail.setText(Html.fromHtml("password: <b>" + email + "</b>"));
        iblPassword.setText(Html.fromHtml("Email: <b>" + password + "</b>"));



       // TextView tvWelcomeMsg = (TextView) findViewById(R.id.USERAREAtvWelcomeMsg);
       // EditText etUsername = (EditText) findViewById(R.id.USERAREAetUsername);
       // EditText etAge = (EditText) findViewById(R.id.USERAREAetAge);


       // Intent intent = getIntent();
       // String namee = intent.getStringExtra("name");
       // String username = intent.getStringExtra("username");
       // int age = intent.getIntExtra("age", -1);


        // Display user details
      //  String message = namee + " welcome to your user area";
       // tvWelcomeMsg.setText(message);
       // etUsername.setText(username);
        //etAge.setText(age + "");
    }


    public  void logout(View view){

        // Clear the session data
        // This will clear all session data and
        // redirect user to LoginActivity
        session.logoutUser();

    }

}

