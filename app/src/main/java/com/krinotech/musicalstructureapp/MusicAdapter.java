package com.krinotech.musicalstructureapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.krinotech.musicalstructureapp.databinding.MusicItemBinding;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {
    private List<Music> music;

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MusicItemBinding view = DataBindingUtil
                .inflate(layoutInflater, R.layout.music_item, parent, false);

        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music = this.music.get(position);
        holder.bind(music);
    }

    @Override
    public int getItemCount() {
        if(music != null) {
            return music.size();
        }
        return 0;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
        notifyDataSetChanged();
    }
}
