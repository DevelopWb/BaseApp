package com.appmodle.navigationFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appmodle.R;

/**
 * Author:wang_sir
 * Time:2018/6/20 21:18
 * Description:This is FirstFragment
 */


public class FirstFragment extends Fragment {
    private static FirstFragment mFragment = null;


    public static FirstFragment getInstance() {
        return FirstFragmentHolder.instatce;
    }

    private static class FirstFragmentHolder {
        private static FirstFragment instatce = new FirstFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.first_fragment,container,false);
       return view;
    }


}
