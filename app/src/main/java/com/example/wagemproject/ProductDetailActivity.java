package com.example.wagemproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // Inisialisasi Views
        ImageView imgDetailProduct = findViewById(R.id.img_detail_product);
        TextView tvDetailName = findViewById(R.id.tv_detail_name);
        TextView tvDetailDescription = findViewById(R.id.tv_detail_description);

        // Ambil data dari Intent
        String productName = getIntent().getStringExtra("product_name");
        String productDescription = getIntent().getStringExtra("product_description");
        int productImage = getIntent().getIntExtra("product_image", R.drawable.onix1);


        // Set data ke Views
        imgDetailProduct.setImageResource(productImage);
        tvDetailName.setText(productName);
        tvDetailDescription.setText(productDescription);
    }
}
