package com.ps_bn.filmfinderpractice;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ps_bn.filmfinderpractice.MainActivity;
import com.ps_bn.filmfinderpractice.R;

public class RecyclerViewItem {

    private int imageView;
    private String titleText;
    private Button button;
    private String description;

    public RecyclerViewItem(int imageView, String titleText,String description) {
        this.imageView = imageView;
        this.titleText = titleText;
        this.description=description;
    }


    public int getImageView() {
        return imageView;
    }

    public String getTitleText() {
        return titleText;
    }

    public Button getButton() {
        return button;
    }

    public String getDescription() {
        return description;
    }
}
