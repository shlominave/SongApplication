package com.example.songapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView ListView1;
ArrayList<Song>song=new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView1=findViewById(R.id.LV1);
        getsongdata();
      //  SongAdapter sa=new SongAdapter();
        SongAdapter.OurSongAdapter sa(this,R.layout.Song,song)


    }
    public void getsongdata()
    {
        Song s=new Song("singer1","song 1","pic1",2);
        song.add(s);
         s=new Song("singer1","song 2","pic1",2);
        song.add(s);
         s=new Song("singer1","song 3","pic1",2);
        song.add(s);
         s=new Song("singer1","song 4","pic1",2);
        song.add(s);
        s=new Song("singer1","song 5","pic1",2);
        song.add(s);
    }
    public class SongAdapter extends ArrayList<Song> {


        public class OurSongAdapter extends ArrayList<Song>{


                Context c;
                int resource;
                List<Song> objects;
                public OurSongAdapter(Context c1, int resource, List<Song> objects)
                {
                super(c1,resource,objects);
                this.c = c1;
                this.resource = resource;
                this.objects = objects;
            }





        }
    }
}