package com.example.recyclerview_images;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Application;
import android.os.Bundle;

import com.example.recyclerview_images.databinding.ActivityMainBinding;
import com.example.recyclerview_images.databinding.DesignBinding;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.recycle.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(getinformation());  //Hear getinformation is a only function this name is given by your choice.
        activityMainBinding.recycle.setAdapter(adapter);


    }

    public List<Information> getinformation() {
        List<Information> applist = new ArrayList<>();
        applist.add(new Information("Whatsapp", "Sending Messages",R.drawable.whasapp));
        applist.add(new Information("Snapchat", "Sending Chat", R.drawable.snapchat));
        applist.add(new Information("Facebook", "Sending Messages and Storeys", R.drawable.facebook));
        applist.add(new Information("Instagram", "Reels", R.drawable.instragram));
        applist.add(new Information("ShareChat", "Sending Messages", R.drawable.sharechat));
        applist.add(new Information("Twitter", "Tweet", R.drawable.twitter));
        applist.add(new Information("Give Feed back", "", R.drawable.rate));
        applist.add(new Information("Share", "Share With your Friends", R.drawable.share));
        applist.add(new Information("More Apps", "", R.drawable.moreapp));
        applist.add(new Information("Download", "download our app", R.drawable.download));
        applist.add(new Information("Next", "Next page", R.drawable.arrow));
        applist.add(new Information("About", "about the app", R.drawable.about));

        return applist;
    }
}
