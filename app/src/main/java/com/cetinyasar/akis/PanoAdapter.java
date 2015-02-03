package com.cetinyasar.akis;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Çetin on 3.2.2015.
 */
public class PanoAdapter  extends RecyclerView.Adapter<PanoAdapter.PanoViewHolder> {

    private final Fragment mFragment;
    OnItemPanoClickListener clickListener;

    private IsAkisiListesi isAkisiListesi;

    public PanoAdapter(Fragment fragment) {
        this.mFragment = fragment;

        IHttpVeriAlan veriAlanMock = new HttpVeriAlanMock();
        GorevleriAlInput gaInput = new GorevleriAlInput();
        gaInput.Query = "";
        gaInput.KayitNo = "0";

        isAkisiListesi = VeriAl.GorevleriAl(gaInput, veriAlanMock);
    }

    @Override
    public PanoAdapter.PanoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.pano_elemani, viewGroup, false);

        return new PanoViewHolder(itemView);
    }

    //private RecyclerView.LayoutManager mLayoutManager;
    //private IslerAdapter mIslerAdapter;
    @Override
    public void onBindViewHolder(PanoAdapter.PanoViewHolder panoHolder, int panoNo) {
        Pano pano = isAkisiListesi.Panolar.get(panoNo);
        panoHolder.vAdi.setText(pano.Ad);
//        panoHolder.vIslerRecyclerView.setAdapter(new IslerAdapter(mFragment, pano.Isler));
//        panoHolder.vIslerRecyclerView.getLayoutManager().measureChildWithMargins(panoHolder.vView,50,100);
    }

    @Override
    public int getItemCount() {
        return isAkisiListesi.Panolar.size();
    }

    public void SetOnItemPanoClickListener(final OnItemPanoClickListener mClickListener)
    {
        clickListener = mClickListener;
    }

    public class PanoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected TextView vAdi;
        //private RecyclerView vIslerRecyclerView;
        //private View vView;

        public PanoViewHolder(View v) {
            super(v);
            //vView = v;
            vAdi =  (TextView) v.findViewById(R.id.txtAdi);
//            vIslerRecyclerView = (RecyclerView)v.findViewById(R.id.isler_recycler_view);
//            vIslerRecyclerView.setHasFixedSize(true);
//            LinearLayoutManager layoutManager = new LinearLayoutManager(mFragment.getActivity());
//            vIslerRecyclerView.setLayoutManager(layoutManager);


            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if (clickListener != null)
                clickListener.onItemClick(v, getPosition(), 0);
            //clickListener.onItemClick(v, getPosition(), islerList.get(getPosition()).Id);
        }
    }
}
