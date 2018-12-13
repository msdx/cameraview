package com.google.android.cameraview.demo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

/**
 * @author 黄浩杭 (msdx.android@qq.com)
 * @since 2018-12-13
 */
public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setContentView(imageView);
        File file = new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES),
                "picture.jpg");
        final Bitmap bitmap = BitmapFactory.decodeFile(file.getPath());
        imageView.setImageBitmap(bitmap);
    }
}
