package com.example.picassotest;

import android.app.Application;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

/**
 * Created by Administrator on 2017/8/7.
 */

public class ImageLoad {

    public void imageLoad(String url, int width, int height, ImageView image) {

        Picasso.with(image.getContext()).load(url).centerCrop().resize(width, height).into(image);

    }

    public void bigImageLoad(String url, ImageView image) {
        Picasso.with(image.getContext()).load(url).memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE).into(image);
    }

}
