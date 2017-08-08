package com.example.picassotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String URL = "http://imgsrc.baidu.com/imgad/pic/item/267f9e2f07082838b5168c32b299a9014c08f1f9.jpg";

    private ImageView imageview;

    private ImageLoad imageLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview = (ImageView) findViewById(R.id.imageview);
        imageview.setOnClickListener(this);

        imageLoad = new ImageLoad();
        imageLoad();

    }

    public void imageLoad() {

        imageLoad.imageLoad(URL, 250, 250, imageview);

    }

    public void bigImage() {
        imageLoad.bigImageLoad(URL, imageview);
    }

    @Override
    public void onClick(View view) {
        bigImage();
    }
}
