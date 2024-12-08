package com.example.wagemproject;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Toolbar elemen
        EditText searchBar = findViewById(R.id.search_bar);
        ImageView ivCart = findViewById(R.id.iv_cart);
        ImageView ivWishlist = findViewById(R.id.iv_wishlist);

        // Event untuk klik pada ikon keranjang
        ivCart.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Keranjang diklik!", Toast.LENGTH_SHORT).show());

        // Event untuk klik pada ikon wishlist
        ivWishlist.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Wishlist diklik!", Toast.LENGTH_SHORT).show());

        // Set Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new HomeFragment()); // Default fragment

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.nav_transaksi:
                    selectedFragment = new TransactionFragment();
                    break;
                case R.id.nav_chat:
                    selectedFragment = new ChatFragment();
                    break;
                case R.id.nav_profile:
                    selectedFragment = new ProfileFragment();
                    break;
            }
            return loadFragment(selectedFragment);
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
