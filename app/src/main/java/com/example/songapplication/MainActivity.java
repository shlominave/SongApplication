package com.example.songapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView ListView1;

ArrayList<Country> countrylist =new  ArrayList<Country>();
YourAdapter ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata();
        ad=new YourAdapter(this,R.layout.country_layout,countrylist);
        ListView1=(ListView)findViewById(R.id.LV1);

        ListView1.setAdapter(ad);
        ListView1.setOnItemClickListener(Itemlistener);

//        getsongdata();
//      //  SongAdapter sa=new SongAdapter();
//        SongAdapter.OurSongAdapter sa(this,R.layout.Song,song)


    }
    private AdapterView.OnItemClickListener Itemlistener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, countrylist.get(position).toString(), Toast.LENGTH_SHORT).show();
        }
    };
    public void getdata()
    {
        Country c=new Country("serbia","serbia.png",20000000);
      countrylist.add(c);
        c=new Country("belarus","belarus.png",9400000);
        countrylist.add(c);
        c=new Country("spain","spain.png",40000000);
        countrylist.add(c);
        c=new Country("unitedkingdom","unitedkingdom.png",64000000);
        countrylist.add(c);

    }
    public class YourAdapter extends ArrayAdapter<Country> {
       private Context c;
       private int resource;
       private ArrayList<Country> objects;

        public YourAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Country> objects) {
            super(context, resource, objects);
            this.c=c;
            this.resource=resource;
            this.objects=objects;
        }

        @Override
        public int getCount() {
            return this.objects.size();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         View v=null;
            LayoutInflater li=(LayoutInflater)this.c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
         v=li.inflate(this.resource,null);
         Country c=this.objects.get(position);
            TextView countrynametv =findViewById(R.id.countrynametv);
            TextView populationtv =findViewById(R.id.populationtv);
       ImageView iv=findViewById(R.id.imageView1);
            countrynametv.setText(c.getCountryname());
            populationtv.setText(c.getPopulation()+"");
            return v;


        }
    }
//    public class SongAdapter extends ArrayList<Song> {
//
//
//        public class OurSongAdapter extends ArrayList<Song>{
//
//
//                Context c;
//                int resource;
//                List<Song> objects;
//                public OurSongAdapter(Context c1, int resource, List<Song> objects)
//                {
//                super(c1,resource,objects);
//                this.c = c1;
//                this.resource = resource;
//                this.objects = objects;
//            }
//
//
//
//
//
//        }
//    }
}