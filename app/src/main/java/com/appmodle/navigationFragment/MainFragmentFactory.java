package com.appmodle.navigationFragment;

import android.util.SparseArray;

/**
 * Author:wang_sir
 * Time:2018/6/20 21:10
 * Description:This is MainFragmentFactory
 */
public class MainFragmentFactory {



    public static SparseArray<android.support.v4.app.Fragment> getmFragments(){
        SparseArray<android.support.v4.app.Fragment> mFragments =  new SparseArray<>();
        mFragments.put(0,FirstFragment.getInstance());
        mFragments.put(1,SecondFragment.getInstance());
        mFragments.put(2,ThirdFragment.getInstance());
        mFragments.put(3,FourthFragment.getInstance());
        return mFragments;
    }
}
