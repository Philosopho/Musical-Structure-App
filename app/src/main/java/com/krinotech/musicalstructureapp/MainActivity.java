package com.krinotech.musicalstructureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import com.krinotech.musicalstructureapp.databinding.ActivityMainBinding;

import java.util.List;

import static com.krinotech.musicalstructureapp.MusicProvider.provideMusic;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null) {
            actionBar.setTitle(R.string.music_selection);
        }

        setUpAdapter();
    }

    private void setUpAdapter() {
        List<Music> music = provideMusic();
        MusicAdapter musicAdapter = new MusicAdapter();
        musicAdapter.setMusic(music);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        binding.rvMain.setHasFixedSize(true);
        binding.rvMain.setLayoutManager(linearLayoutManager);
        binding.rvMain.setAdapter(musicAdapter);
    }
}
