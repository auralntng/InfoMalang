package id.sch.smktelkom_mlg.xirpl204132231.infomalang.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl204132231.infomalang.R;
import id.sch.smktelkom_mlg.xirpl204132231.infomalang.model.Home;

/**
 * Created by Krisna Putra F on 11/15/2016.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>
{
    ArrayList<Home> homeList;

    public HomeAdapter(ArrayList<Home> homeList){this.homeList = homeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Home home = homeList.get(position);
        holder.tvJudul.setText(home.judul);
        holder.ivFoto.setImageDrawable(home.foto);

    }

    @Override
    public int getItemCount() {
        if (homeList != null)
            return homeList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        }

    }

}

