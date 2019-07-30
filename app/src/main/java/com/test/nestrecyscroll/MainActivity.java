package com.test.nestrecyscroll;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> pageList;
    private List<String> titleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemAdapter adapter = new ItemAdapter(this);
        RecyclerView recyHead = findViewById(R.id.recy);
        recyHead.setLayoutManager(new LinearLayoutManager(this));
        recyHead.setAdapter(adapter);

        initData();

        TabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager viewPager = findViewById(R.id.viewpager);

        BaseViewPageAdapter pageAdapter = new BaseViewPageAdapter(getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(pageAdapter);
    }

    private void initData() {
        pageList = new ArrayList<>();
        titleList = new ArrayList<>();
        titleList.add("分类1");
        titleList.add("分类2");
        titleList.add("分类3");
        titleList.add("分类4");

        for (int i = 0; i < titleList.size(); i++) {
            pageList.add(new PageFragment());
        }
    }

    public class BaseViewPageAdapter extends FragmentStatePagerAdapter {

        public BaseViewPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return pageList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }

        @Override
        public int getCount() {
            return pageList.size();
        }
    }
}
