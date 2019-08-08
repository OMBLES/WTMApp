package com.example.wtmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText, phoneEditText;
    Button regBtn;
    String imageUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment);
        imageUrl = "https://i.imgur.com/DvpvklR.png";
        ImageView imageView = findViewById (R.id.avatar);
      //  initializeUi();
    }

   /* private void initializeUi() {
        nameEditText = findViewById(R.id.name_text_view);
        phoneEditText = findViewById(R.id.phone_text_view);
        regBtn = findViewById(R.id.btn_register);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase mDb = FirebaseDatabase.getInstance();
                DatabaseReference mRef = mDb.getReference().child("users");
                User user = new User(nameEditText.getText().toString(), imageUrl, phoneEditText.getText().toString());
                mRef.push().setValue(user);
            }
        });

    }*/
}
