package id.sch.smktelkom_mlg.xirpl204132231.infomalang.adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl204132231.infomalang.R;
import id.sch.smktelkom_mlg.xirpl204132231.infomalang.model.Home;

/**
 * Created by Krisna Putra F on 11/15/2016.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    ArrayList<Home> homeArrayList;

    public HomeAdapter(ArrayList<Home> homeArrayList) {
        this.homeArrayList = homeArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Home home = homeArrayList.get(position);
        holder.ivFoto.setImageDrawable(Drawable.createFromPath(home.foto));

    }

    @Override
    public int getItemCount() {
        if (homeArrayList != null)
            return homeArrayList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;

        public ViewHolder(View itemView) {

            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
        }

    }

}

