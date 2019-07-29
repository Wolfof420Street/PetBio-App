package com.wolf.petbioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImage;
    private TextView nameTextView;
    private TextView petBioTextView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImage = (ImageView) findViewById(R.id.petBioImageView);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        petBioTextView = (TextView) findViewById(R.id.petBioTextView);

        extras= getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("Bio");

            setUp(name, bio);

        }




    }

    public  void setUp (String name, String bio) {

        if (name.equals("Wiz")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petBioTextView.setText(bio);
            nameTextView.setText(name);


        } else if (name.equals("Pussy")) {
            petImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            petBioTextView.setText(bio);
            nameTextView.setText(name);


        }

    }
}
