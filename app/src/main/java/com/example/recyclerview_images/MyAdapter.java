package com.example.recyclerview_images;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_images.databinding.DesignBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Viewholder> {

    List<Information> applist;

    public MyAdapter(List<Information> applist) {
        this.applist = applist;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        DesignBinding designBinding = DesignBinding.inflate(inflater, parent, false);
        return new Viewholder(designBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

       Information info = applist.get(position);
        holder.designBinding.setApp(info);



    }

    @Override
    public int getItemCount() {
        return applist.size();
    }


    class Viewholder extends RecyclerView.ViewHolder {
        DesignBinding designBinding;


        public Viewholder(@NonNull DesignBinding designBinding) {
            super(designBinding.getRoot());
           this.designBinding=designBinding;


        }
    }
}
