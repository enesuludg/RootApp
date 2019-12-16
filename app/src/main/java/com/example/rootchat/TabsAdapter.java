package com.example.rootchat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                requestFragment requestFragment = new requestFragment();
                return requestFragment;
            case 1:
                chatFragment chatFragment =new chatFragment();
                return chatFragment;
            case 2:
                friendsFragment friendsFragment =new friendsFragment();
                return friendsFragment;

            default:
                return null;

        }



    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "Request";
            case 1:
                return  "Chat";
            case 2:
                return "Friends";
             default:
                 return null;



    }
}

