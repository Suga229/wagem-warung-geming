package com.example.wagemproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_transaksi:
                    Toast.makeText(this, "Transaksi Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_chat:
                    Toast.makeText(this, "Chat Selected", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_profile:
                    Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return false;
            }
        });

        // SearchView
        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(MainActivity.this, "Mencari: " + query, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Lakukan sesuatu saat teks pencarian berubah
                return false;
            }
        });

        // Wishlist Button
        ImageView btnWishlist = findViewById(R.id.btn_wishlist);
        btnWishlist.setOnClickListener(v ->
                Toast.makeText(this, "Wishlist Clicked", Toast.LENGTH_SHORT).show()
        );

        // Cart Button
        ImageView btnCart = findViewById(R.id.btn_cart);
        btnCart.setOnClickListener(v ->
                Toast.makeText(this, "Keranjang Clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
