package com.example.epi2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Gravity;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText login, password, code;
    Button  valider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gotob=(Button)findViewById(R.id.gotob);
        login=(EditText) findViewById(R.id.login);
        password=(EditText) findViewById(R.id.password);
        code=(EditText) findViewById(R.id.code);
        valider=(Button) findViewById(R.id.valider);

        gotob.setOnClickListener(this);
        valider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(login.getText().toString().equals("")||password.getText().toString().equals("")||code.getText().toString().equals("")){
            if (login.getText().toString().equals("")){
                login.setVisibility(View.VISIBLE);
            }
            if (password.getText().toString().equals("")){
            }
            if (code.getText().toString().equals("")){
            }
        }
        else{

            switch (v.getId()) {
                case R.id.valider: {
                    if (login.getText().toString().equals(password.getText().toString()))
                    {
                        if (code.getText().toString().equals("azerty")){
                            Intent myInten = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(myInten);
                        }
                        else
                        {
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(MainActivity.this, getResources().getString(R.string.codetext), duration);
                            toast.show();
                        }
                    }
                    else {
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(MainActivity.this, getResources().getString(R.string.toasttext), duration);
                        toast.show();
                    }


                    break;
                }
                case R.id.gotob: {

                    Intent myInten = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(myInten);
                    break;
                }


                default: {
                    finish();
                    break;
                }
            }
        }
            }

}
