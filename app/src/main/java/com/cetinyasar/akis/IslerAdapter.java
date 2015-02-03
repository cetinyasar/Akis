package com.cetinyasar.akis;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Çetin on 1.2.2015.
 */
public class IslerAdapter extends RecyclerView.Adapter<IslerAdapter.IslerViewHolder> {

    private final Fragment mFragment;
    //private List<IsAkisiTanim> islerList;
    private List<AramaSonucuIsAkisiInstance> isAkisiListesi;
    OnItemClickListener clickListener;
    //private static int panoNo = 0;

    public IslerAdapter(Fragment fragment, List<AramaSonucuIsAkisiInstance> isAkisiListesi) {
        this.mFragment = fragment;
        this.isAkisiListesi = isAkisiListesi;
    }

    @Override
    public IslerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.is_liste_elemani, viewGroup, false);

        return new IslerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(IslerViewHolder islerViewHolder, int i) {
        islerViewHolder.vAdi.setText(isAkisiListesi.get(i).Baslik);
    }

    @Override
    public int getItemCount() {

        return this.isAkisiListesi.size();
    }

    public class IslerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected TextView vAdi;
        protected TextView vAciklama;
        protected ImageView vImage;


        public IslerViewHolder(View v) {
            super(v);
            vAdi =  (TextView) v.findViewById(R.id.txtAdi);
            vAciklama = (TextView)  v.findViewById(R.id.txtAciklama);
            vImage = (ImageView)v.findViewById(R.id.imgResim);
            //if ()
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if (clickListener != null)
                clickListener.onItemClick(v, getPosition(), 0);
        }
    }

    public void SetOnItemClickListener(final OnItemClickListener mClickListener)
    {
        clickListener = mClickListener;
    }

}

