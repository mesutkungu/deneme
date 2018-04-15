package com.rank.ranktableviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private RankListAdapter adapter;
    private List<Team> teamList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        teamList=new ArrayList<>();
        teamList.add(new Team(1,"Eküri","Miri'm","8"));
        teamList.add(new Team(1,"Kaybedenler Kulübü","Sesli Yanıt Sistemi","7"));
        teamList.add(new Team(1,"Deneme yanılma grubu","En uzun fikir adı benim dedim","6"));
        teamList.add(new Team(1,"Grup Hepsi","Yalan","5"));
        teamList.add(new Team(1,"Conconlar","Starbucks Projesi","4"));
        teamList.add(new Team(1,"Grup Şurup","ABC","3"));
        adapter=new RankListAdapter(this,teamList);
        listView.setAdapter(adapter);
        ViewGroup headerView = (ViewGroup)getLayoutInflater().inflate(R.layout.rank_list_header, listView,false);
        // Add header view to the ListView
        listView.addHeaderView(headerView);
    }
}
