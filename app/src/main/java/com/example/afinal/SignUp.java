package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText username,password;
    Button signup,login;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        signup=(Button) findViewById(R.id.signup);

        DB=new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if (user.equals("")||pass.equals(""))
                    Toast.makeText(SignUp.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuser=DB.checkusername(user);
                    if(checkuser==false){
                        Boolean insert =DB.insertData(user,pass);
                        if(insert==true){
                            Toast.makeText(SignUp.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(SignUp.this, "Registration failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(SignUp.this, "User already exists!Please sign in", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}