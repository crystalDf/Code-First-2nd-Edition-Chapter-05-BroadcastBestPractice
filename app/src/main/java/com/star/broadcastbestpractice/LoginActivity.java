package com.star.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    public static final String ACCOUNT = "admin";
    public static final String PASSWORD = "123456";

    private EditText mAccountEditText;
    private EditText mPasswordEditText;

    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAccountEditText = findViewById(R.id.account);
        mPasswordEditText = findViewById(R.id.password);

        mLoginButton = findViewById(R.id.login);
        mLoginButton.setOnClickListener(v -> {

            String account = mAccountEditText.getText().toString();
            String password = mPasswordEditText.getText().toString();

            if (ACCOUNT.equals(account) && PASSWORD.equals(password)) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(LoginActivity.this, "Account or Password is invalid",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
