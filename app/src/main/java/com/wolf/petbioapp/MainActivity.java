  package com.wolf.petbioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                /*Toast.makeText(MainActivity.this, "You touched the Pussy", Toast.LENGTH_LONG).show();*/
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Pussy");
                catIntent.putExtra("Bio", "Fire P, very friendly, very comfortable, loves nuts");
                startActivity(catIntent);
                break;
            case R.id.dogImage:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Wiz");
                dogIntent.putExtra("Bio", "Good dog, love him once , he will love you everyday");
                startActivity(dogIntent);
                /*Toast.makeText(MainActivity.this, "You touched the Doggy", Toast.LENGTH_LONG).show();*/
                break;
        }

      }
  }
