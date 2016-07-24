package com.gorka.larrabetzu.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gorka.larrabetzu.R;


public class FragmentAssociations extends Fragment {

    private View fragmentView;
    private Activity activity;

    public FragmentAssociations() {
        super();
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.fragmentView = getFragmentView(inflater, container);
        initViews();
        return this.fragmentView;
    }

    private View getFragmentView(final LayoutInflater inflater, final ViewGroup container) {
        return inflater.inflate(R.layout.fragment_event, container, false);
    }

    private void initViews() {

    }
}
