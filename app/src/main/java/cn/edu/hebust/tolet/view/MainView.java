package cn.edu.hebust.tolet.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;

/**
 * Created by shixi_tianrui1 on 16-8-28.
 * 主界面
 */
public class MainView extends RelativeLayout {

    private TabHostView mTabView;
    private ViewPager mPvContainer;

    public MainView(Context context) {
        super(context);
        mTabView = new TabHostView(context);

    }
}
