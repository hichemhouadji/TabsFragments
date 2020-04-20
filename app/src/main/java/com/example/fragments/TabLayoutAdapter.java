package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> myfragmetList=new ArrayList<>();
    private final List<String> myfragmentTitleList=new ArrayList<>();

    public TabLayoutAdapter( FragmentManager fm) {
        super (fm);
    }

    public void addFragment(Fragment fragment,String title){
        myfragmetList.add(fragment);
        myfragmentTitleList.add(title);

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return myfragmetList.get(position);
    }//end getitem

    @Override
    public int getCount() {
        return myfragmetList.size();
    }// end getCount

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return myfragmentTitleList.get(position);
    }// end getPageTitle
}
