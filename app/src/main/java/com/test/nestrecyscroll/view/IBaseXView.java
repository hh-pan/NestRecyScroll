package com.test.nestrecyscroll.view;

import android.app.Activity;

/**
 * Created by Pan on 2019/8/6.
 * Desc:
 */
public interface IBaseXView {

    /**
     * 获取Activity对象
     *
     * @param <T>
     * @return
     */

    <T extends Activity> T getSelfActivity();
}
