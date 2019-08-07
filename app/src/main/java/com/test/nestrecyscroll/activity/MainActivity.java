package com.test.nestrecyscroll.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.test.nestrecyscroll.R;
import com.test.nestrecyscroll.adapter.ItemAdapter;
import com.test.nestrecyscroll.fragment.PageFragment;
import com.test.nestrecyscroll.presenter.IBasePresenter;
import com.test.nestrecyscroll.view.IBaseView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<IBasePresenter> implements IBaseView {

    private List<Fragment> pageList;
    private List<String> titleList;

    @Override
    public int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public IBasePresenter onBindPresenter() {
        return null;
    }

    @Override
    public void initData() {
        titleList = new ArrayList<>();
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

    @Override
    public void initView() {
        super.initView();

        ItemAdapter adapter = new ItemAdapter(this);
        RecyclerView recyHead = findViewById(R.id.recy);
        recyHead.setLayoutManager(new LinearLayoutManager(this));
        recyHead.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager viewPager = findViewById(R.id.viewpager);

        BaseViewPageAdapter pageAdapter = new BaseViewPageAdapter(getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(pageAdapter);
    }

    @Override
    public void initListener() {
        super.initListener();

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, LoginActivity.class));
            }
        });
    }

    public class BaseViewPageAdapter extends FragmentStatePagerAdapter {

        BaseViewPageAdapter(FragmentManager fm) {
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
