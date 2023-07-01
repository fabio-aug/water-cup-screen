package com.ifmg.watercup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ifmg.watercup.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ScreenViewModel viewModel = new ViewModelProvider(this).get(ScreenViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setScreenModel(viewModel);

        CupAdapter adapter = new CupAdapter(viewModel.getItems());

        RecyclerView list = findViewById(R.id.list_items);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
    }
}