  package com.wolf.petbioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catImage;
    private ImageView dogImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImage = (ImageView) findViewById(R.id.catImage);
        dogImage = (ImageView) findViewById(R.id.dogImage);

        catImage.setOnClickListener(this);
        dogImage.setOnClickListener(this);
    }

      @Override
      public void onClick(View view) {
        switch (view.getId()) {
            case R.id.catImage:
                Toast.makeText(MainActivity.this, "You touched the Pussy", Toast.LENGTH_LONG).show();
                break;
            case R.id.dogImage:
                Toast.makeText(MainActivity.this, "You touched the Doggy", Toast.LENGTH_LONG).show();
                break;
        }

      }
  }
