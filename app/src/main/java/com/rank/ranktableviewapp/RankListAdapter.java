package com.rank.ranktableviewapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RankListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Team> teamList;

    public RankListAdapter(Context mContext, List<Team> teamList) {
        this.mContext = mContext;
        this.teamList = teamList;
    }

    @Override
    public int getCount() {
        return teamList.size();
    }

    @Override
    public Object getItem(int i) {
        return teamList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){

            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            view = inflater.inflate(R.layout.rank_list_item, viewGroup, false);
        }
        TextView rankTeamTxtVw=view.findViewById(R.id.rankTeamTxtVw);
        TextView rankTeamNameTxtVw=view.findViewById(R.id.rankTeamNameTxtVw);
        TextView rankTeamIdeaTxtVw=view.findViewById(R.id.rankTeamIdeaTxtVw);
        ImageView rankTeamCupImgVw=view.findViewById(R.id.rankTeamCupImgVw);
        TextView rankTeamPointTxtVw=view.findViewById(R.id.rankTeamPointTxtVw);
        rankTeamTxtVw.setText((i+1)+"");
        rankTeamNameTxtVw.setText(teamList.get(i).getName());
        rankTeamIdeaTxtVw.setText(teamList.get(i).getIdea());
        if(i==0){
            rankTeamCupImgVw.setImageResource(R.drawable.goldencup);
            rankTeamCupImgVw.setVisibility(View.VISIBLE);
        }else if(i==1){
            rankTeamCupImgVw.setImageResource(R.drawable.silvercup);
            rankTeamCupImgVw.setVisibility(View.VISIBLE);
        }else if(i==2){
            rankTeamCupImgVw.setImageResource(R.drawable.bronzecup);
            rankTeamCupImgVw.setVisibility(View.VISIBLE);
        }else{
            rankTeamCupImgVw.setVisibility(View.INVISIBLE);
        }
        rankTeamPointTxtVw.setText(teamList.get(i).getPoints());
        return view;
    }
}
