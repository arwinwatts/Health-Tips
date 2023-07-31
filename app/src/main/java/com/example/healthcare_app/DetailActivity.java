package com.example.healthcare_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView detailDesc, detailDesc8, detailDesc2, detailDesc3, detailDesc4, detailDesc5, detailDesc6, detailDesc7, detailTitle, detailTitle2;
    ImageView detailImage, detailImage2, detailImage3, detailImage4, detailImage5, detailImage6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailDesc = findViewById(R.id.detailDesc);
        detailDesc8 = findViewById(R.id.detailDesc8);
        detailDesc2 = findViewById(R.id.detailDesc2);
        detailDesc3 = findViewById(R.id.detailDesc3);
        detailDesc4 = findViewById(R.id.detailDesc4);
        detailDesc5 = findViewById(R.id.detailDesc5);
        detailDesc6 = findViewById(R.id.detailDesc6);
        detailDesc7 = findViewById(R.id.detailDesc7);
        detailTitle = findViewById(R.id.detailTitle);
        detailTitle2 = findViewById(R.id.detailTitle2);
        detailImage = findViewById(R.id.detailImage);
        detailImage2 = findViewById(R.id.detailImage2);
        detailImage3 = findViewById(R.id.detailImage3);
        detailImage4 = findViewById(R.id.detailImage4);
        detailImage5 = findViewById(R.id.detailImage5);
        detailImage6 = findViewById(R.id.detailImage6);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailDesc.setText(bundle.getInt("Desc"));
            detailDesc8.setText(bundle.getInt("Desc8"));
            detailDesc2.setText(bundle.getInt("Desc2"));
            detailDesc3.setText(bundle.getInt("Desc3"));
            detailDesc4.setText(bundle.getInt("Desc4"));
            detailDesc5.setText(bundle.getInt("Desc5"));
            detailDesc6.setText(bundle.getInt("Desc6"));
            detailDesc7.setText(bundle.getInt("Desc7"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailImage2.setImageResource(bundle.getInt("Image2"));
            detailImage3.setImageResource(bundle.getInt("Image3"));
            detailImage4.setImageResource(bundle.getInt("Image4"));
            detailImage5.setImageResource(bundle.getInt("Image5"));
            detailImage6.setImageResource(bundle.getInt("Image6"));
            detailTitle.setText(bundle.getString("Title"));
            detailTitle2.setText(bundle.getString("Title2"));
        }
    }
}