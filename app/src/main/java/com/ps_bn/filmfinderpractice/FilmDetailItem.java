package com.ps_bn.filmfinderpractice;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ps_bn.filmfinderpractice.R;

public class FilmDetailItem extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_details);

        TextView textViewTitle=findViewById(R.id.detail_title);
        TextView textViewDescription=findViewById(R.id.detail_film_description);
        ImageView img=findViewById(R.id.detail_img);

        Intent intent=getIntent();
        if (intent!=null){
            textViewTitle.setText(intent.getStringExtra("Title"));
            textViewDescription.setText(intent.getStringExtra("desc"));
            img.setImageResource(intent.getIntExtra("img",1));
        }
    }
}
