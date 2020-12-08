package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mymusic.DAO.User;
import com.example.mymusic.DAO.UserDAO;

import java.util.List;

public class Login extends AppCompatActivity{
    private EditText username,password;
    private Button btnlogin,btnRegist;
    private UserDAO userDAO;
    private void init(){
        userDAO= new UserDAO();
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnLogin);
        btnRegist = findViewById(R.id.btnRegist);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        OnClickControl clickControl = new OnClickControl();
        btnRegist.setOnClickListener(clickControl);
        btnlogin.setOnClickListener(clickControl);
        Bundle values = getIntent().getExtras();
        if (values==null){

        }else{
            username.setText(values.getString("username"));
            Log.v("info",values.getString("username"));
            password.setText(values.getString("password"));
        }

    }
    private class OnClickControl implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnLogin:
                    if (username.getText().toString().equals("")){
                        Toast.makeText(Login.this, "账号为空", Toast.LENGTH_LONG).show();
                    }else if (password.getText().toString().equals(""))
                    {
                        Toast.makeText(Login.this, "密码为空", Toast.LENGTH_LONG).show();
                    }else{
                    String where = String.format("where username='%s'and password='%s'",username.getText().toString(),password.getText().toString());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            List<User> user = userDAO.getAll(where);
                            Looper.prepare();//循环扫描，否则Toast不能在子线程中使用
                            if(user.size()>0) {
                                Intent intent = new Intent(Login.this, UserInfo.class);
                                intent.putExtra("ID", user.get(0).getID());
                                intent.putExtra("name", user.get(0).getName());
                                intent.putExtra("sex", user.get(0).getSex());
                                Log.v("IFO",String.valueOf(user.get(0).getID()));
                                Toast.makeText(Login.this, "登录成功", Toast.LENGTH_LONG).show();
                                startActivity(intent);
                            }else{
                                Toast.makeText(Login.this, "登陆失败,账号或密码错误！", Toast.LENGTH_LONG).show();
                            }
                        }
                    }).start();
                    }
                    break;
                case R.id.btnRegist:
                    Intent intent = new Intent(Login.this,Regist.class);
                    Toast.makeText(Login.this, "注册界面", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                    break;

            }
        }
    }



}




