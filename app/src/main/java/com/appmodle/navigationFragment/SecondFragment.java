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


public class SecondFragment extends Fragment {
    private static SecondFragment mFragment = null;


    public static SecondFragment getInstance() {
        return SecondFragmentHolder.instatce;
    }

    private static class SecondFragmentHolder {
        private static SecondFragment instatce = new SecondFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.second_fragment,container,false);
       return view;
    }


}
