package com.cetinyasar.akis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Çetin on 1.2.2015.
 */
public class IsDetayFragment extends Fragment {

    private int IsId;
    public IsDetayFragment(){
    }



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_is_detay, container, false);

        //Bundle arguments = savedInstanceState;
        this.IsId = this.getArguments().getInt("IsId");
        //this.IsId = 111;
        //Toast.makeText(getActivity(), "IsId: " + this.IsId, Toast.LENGTH_LONG).show();
        //VeriAl.IsAkisiAl(this.IsId);

        TextView tv = (TextView)rootView.findViewById(R.id.txtAciklama);
        tv.setText("aaa : " + this.IsId);

        return rootView;
    }


}
