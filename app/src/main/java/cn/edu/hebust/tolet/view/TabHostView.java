package cn.edu.hebust.tolet.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.List;

import cn.edu.hebust.tolet.R;

/**
 * Created by shixi_tianrui1 on 16-8-27.
 * 主界面选项卡
 */
public class TabHostView extends RelativeLayout {


    private Button[] mNavBtn = new Button[3];  // 导航按钮
    private Context mContext;
    private View mRoot;


    public TabHostView(Context context) {
        super(context);
        mContext = context;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        mRoot = inflater.inflate(R.layout.view_bottom_tabhost, null, false);
        mNavBtn[0] = (Button) mRoot.findViewById(R.id.id_btn_house);
        mNavBtn[1] = (Button) mRoot.findViewById(R.id.id_btn_chat);
        mNavBtn[2] = (Button) mRoot.findViewById(R.id.id_btn_user);
        // 默认显示首页
        mNavBtn[0].setSelected(true);
    }


    public void setOnclickListener(OnClickListener onclickListener) {
        for (Button btn : mNavBtn)
            btn.setOnClickListener(onclickListener);
    }


    public void setNavSelected(int index) {
        for (int i = 0; i < mNavBtn.length; i++) {
            if (i == index) {
                setBtnSelected(mNavBtn[i]);
            } else {
                setBtnUnSelected(mNavBtn[i]);
            }
        }
    }

    private void setBtnSelected(Button btn) {
        btn.setTextColor(getResources().getColor(R.color.colorPrimary));
        btn.setSelected(true);
    }

    private void setBtnUnSelected(Button btn) {
        btn.setTextColor(getResources().getColor(R.color.navButton));
        btn.setSelected(false);
    }

}
