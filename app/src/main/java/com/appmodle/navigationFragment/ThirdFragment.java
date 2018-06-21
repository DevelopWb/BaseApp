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


public class ThirdFragment extends Fragment {
    private static ThirdFragment mFragment = null;


    public static ThirdFragment getInstance() {
        return ThirdFragmentHolder.instatce;
    }

    private static class ThirdFragmentHolder {
        private static ThirdFragment instatce = new ThirdFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.third_fragment,container,false);
       return view;
    }


}
