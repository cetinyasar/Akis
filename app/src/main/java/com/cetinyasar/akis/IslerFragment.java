package com.cetinyasar.akis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Çetin on 31.1.2015.
 */
public class IslerFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private PanoAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_isler, container, false);
        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.pano_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(inflater.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new PanoAdapter(this);
        //This is the code to provide a sectioned list
        List<SimpleSectionedRecyclerViewAdapter.Section> sections = new ArrayList<SimpleSectionedRecyclerViewAdapter.Section>();
        //Sections
        sections.add(new SimpleSectionedRecyclerViewAdapter.Section(0,"Diğer Her Şey"));
        sections.add(new SimpleSectionedRecyclerViewAdapter.Section(2,"beklemede"));

        SimpleSectionedRecyclerViewAdapter.Section[] dummy = new SimpleSectionedRecyclerViewAdapter.Section[sections.size()];
        SimpleSectionedRecyclerViewAdapter mSectionedAdapter = new
                SimpleSectionedRecyclerViewAdapter(rootView.getContext(),R.layout.pano_elemani,R.id.txtAdi,mAdapter);
        mSectionedAdapter.setSections(sections.toArray(dummy));

        //Apply this adapter to the RecyclerView
        //mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setAdapter(mSectionedAdapter);


        setRetainInstance(true);
        return rootView; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdapter.SetOnItemPanoClickListener(new OnItemPanoClickListener() {
            @Override
            public void onItemClick(View view, int position, int isId) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                IsDetayFragment ii = new IsDetayFragment();
                Bundle arg = new Bundle();
                arg.putInt("IsId", isId);
                ii.setArguments(arg);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.container, ii);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                fragmentTransaction.commit();

            }
        });
    }

}
