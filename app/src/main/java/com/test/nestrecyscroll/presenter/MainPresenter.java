package com.test.nestrecyscroll.presenter;

import android.support.v4.app.Fragment;

import com.test.nestrecyscroll.MainContacts;
import com.test.nestrecyscroll.activity.MainActivity;
import com.test.nestrecyscroll.fragment.PageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public class MainPresenter extends BasePresenter<MainContacts.MainUi, String> implements MainContacts.MainPresenter {


    public MainPresenter(MainActivity activity) {
        super(activity);
    }
}
