package com.example.fragmentslab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login  extends AppCompatActivity {

    EditText userId, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userId = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userIdText = userId.getText().toString();
                String passwordText = password.getText().toString();
                if(userIdText.isEmpty() || passwordText.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Fill all Fields!", Toast.LENGTH_SHORT).show();
                }else{
                    //Perform Query
                    UserDatabase userDatabase = UserDatabase.getUserDatabase(getApplicationContext());
                    UserDao userDao = userDatabase.userDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            UserEntity userEntity = userDao.login(userIdText, passwordText);
                            if(userEntity ==null){
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }else{
                                String name = userEntity.name;
                                startActivity(new Intent(Login.this,MainActivity.class).putExtra("name",name));
                            }
                        }
                    }).start();
                }
            }
        });
    }
}
