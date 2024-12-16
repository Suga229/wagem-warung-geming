package com.example.wagemproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_recommendations);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Mouse ONI X1", "RP. 300.000", R.drawable.onix1));
        productList.add(new Product("Keyboard Mechanical", "Keyboard RGB Mechanical", R.drawable.keyboard));
        productList.add(new Product("Headphone Wireless", "Headphone dengan kualitas suara tinggi", R.drawable.headphone));
        productList.add(new Product("Gamepad", "Gamepad untuk pengalaman bermain game", R.drawable.gamepad));



        ProductAdapter adapter = new ProductAdapter(getContext(), productList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
