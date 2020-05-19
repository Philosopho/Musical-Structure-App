package com.krinotech.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.krinotech.musicalstructureapp.databinding.MusicItemBinding;

class MusicViewHolder extends RecyclerView.ViewHolder {
    private MusicItemBinding binding;
    private long musicId;

    public MusicViewHolder(@NonNull MusicItemBinding itemView) {
        super(itemView.getRoot());

        binding = itemView;
        binding.playButton.setOnClickListener(startDetailsActivity());
    }

    private View.OnClickListener startDetailsActivity() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources resources = v.getResources();
                Context context = v.getContext();
                Music music = (Music) v.getTag();
                Intent intent = new Intent(context, MusicDetailsActivity.class);
                intent.putExtra(resources.getString(R.string.artist_name_extra), music.getArtistName());
                intent.putExtra(resources.getString(R.string.music_name_extra), music.getMusicName());
                context.startActivity(intent);
            }
        };
    }

    public void bind(Music music) {
        binding.setMusic(music);
        binding.playButton.setTag(music);
        binding.executePendingBindings();
    }
}
