package vn.udn.dut.login01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;

    private EditText _emailText;
    private EditText _passwordText;
    private Button _loginButton;
    private TextView _signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        _loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                login();
//            }
//        });
//
//        _signupLink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // transition to SignUpActivity
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivityForResult(intent,REQUEST_SIGNUP);
//            }
//        });
    }

    public void login(){

    }
}
