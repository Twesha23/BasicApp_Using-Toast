package com.basic.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void shareImage(View view)
    {
        Toast.makeText(this, "Sharing image from app", Toast.LENGTH_SHORT).show();
    }
    public void saveImage(View view)
    {
        Toast.makeText(this, "Saving image from app", Toast.LENGTH_SHORT).show();
    }
    public void uploadImage(View view)
    {
        Toast.makeText(this, "Uploading image from app", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}