# NestRecyScroll
- 仿京东首页的列表，采用顶部recyclerview + 中间tablayout切换分类 + viewpager方式实现，如有更好实现方式可以告诉我，一起学习哈。

**实现难点**

**AppBarLayout嵌套Recyclerview有滑动冲突**，通过自定义Behavior处理滑动冲突。AppBarLayoutBehavior文件来自于网上大神，这里直接拿过来了
，忘记地址了，下次想起来加上，感谢大神提供的方法。

- 代码很简单，以下是布局实现

```
<android.support.design.widget.CoordinatorLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:background="@android:color/white"
        app:layout_behavior=".AppBarLayoutBehavior"
        android:layout_height="wrap_content">

        <android.support.v7.widget.RecyclerView
            android:id="@+id/recy"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:layout_scrollFlags="scroll"/>

        <android.support.design.widget.TabLayout
            android:id="@+id/tablayout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

    </android.support.design.widget.AppBarLayout>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="android.support.design.widget.AppBarLayout$ScrollingViewBehavior">

        <android.support.v4.view.ViewPager
            android:id="@+id/viewpager"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

    </RelativeLayout>

</android.support.design.widget.CoordinatorLayout>
```

**效果**
<iframe height=500 width=500 src="gif地址">


