package com.test.nestrecyscroll.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class BaseViewPageAdapter extends FragmentStatePagerAdapter {

    private List<String> mTitle;
    private List<Fragment> mPage;

    public BaseViewPageAdapter(List<String> title, List<Fragment> page, FragmentManager fm) {
        super(fm);
        mTitle = title;
        mPage = page;
    }

    @Override
    public Fragment getItem(int position) {
        return mPage.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }

    @Override
    public int getCount() {
        return mPage.size();
    }
}