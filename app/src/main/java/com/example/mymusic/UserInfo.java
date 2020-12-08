package com.example.mymusic;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mymusic.DAO.UserDAO;

public class UserInfo extends AppCompatActivity {
    private UserDAO userDAO;
    private TextView name,sex;
    private int ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        name=findViewById(R.id.user_name);
        sex = findViewById(R.id.user_sex);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
             ID = extras.getInt("ID");
             name.setText(extras.getString("name"));
             if (extras.getInt("sex")==1)
             {
                 sex.setText("男");
             }else {
                 sex.setText("女");
             }


        }

    }
}
