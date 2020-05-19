package com.krinotech.musicalstructureapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.krinotech.musicalstructureapp.databinding.ActivityMusicDetailsBinding;

public class MusicDetailsActivity extends AppCompatActivity {
    private ActivityMusicDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_music_details);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setTitle(R.string.music_details);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Intent intent = getIntent();
        String musicName = "";
        String artistName = "";
        if(intent != null) {
            musicName = intent.getStringExtra(getString(R.string.music_name_extra));
            artistName = intent.getStringExtra(getString(R.string.artist_name_extra));
        }
        binding.setMusicName(musicName);
        binding.setArtistName(artistName);
    }
}
