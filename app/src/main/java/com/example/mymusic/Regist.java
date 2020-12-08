package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mymusic.DAO.User;
import com.example.mymusic.DAO.UserDAO;

public class Regist extends AppCompatActivity implements View.OnClickListener {
    private Button btnregist;
    private EditText username,password,name;
    private UserDAO userDAO;
    private ImageButton bacha;
    private RadioButton nan,nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        init();
        btnregist.setOnClickListener(this);
        bacha.setOnClickListener(this);

    }
    public void init(){
        userDAO= new UserDAO();
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnregist=findViewById(R.id.btnRegist);
        name=findViewById(R.id.name);
        bacha = findViewById(R.id.bacha);
        nan = findViewById(R.id.nan);
        nv = findViewById(R.id.nv);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnRegist:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int sex= 1;
                        if(nan.isSelected()){
                            sex=1;
                        }else sex=0;
                        User user = new User(username.getText().toString(), password.getText().toString(), name.getText().toString(),sex);
                        Looper.prepare();//循环扫描，否则Toast不能在子线程中使用
                        if (userDAO.add(user)) {
                            Intent intent = new Intent(Regist.this, Login.class);
                            intent.putExtra("username", username.getText().toString());
                            intent.putExtra("password", password.getText().toString());
                            Toast.makeText(Regist.this, "注册成功！", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        } else {
                            Toast.makeText(Regist.this, "注册成功！", Toast.LENGTH_LONG).show();
                        }
                    }
                }).start();
                break;
            case R.id.bacha:
                Intent intent = new Intent(Regist.this, Login.class);
                startActivity(intent);
        }
    }
}
