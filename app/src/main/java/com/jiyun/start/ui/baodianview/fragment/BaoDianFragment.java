package com.jiyun.start.ui.baodianview.fragment;
import android.view.View;

import com.jiyun.start.App;
import com.jiyun.start.R;
import com.jiyun.start.base.BaseFragment;
import com.jiyun.start.ui.HomeActivity;

public class BaoDianFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_bao_dian;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadData() {

    }

    @Override
    public void updateTitle() {
        ((HomeActivity)(App.context)).getTitleBar().setVisibility(View.VISIBLE);
        ((HomeActivity)(App.context)).getImageShape().setVisibility(View.VISIBLE);
        ((HomeActivity)(App.context)).getImageValuable().setVisibility(View.VISIBLE);
        ((HomeActivity)(App.context)).getTitleLogo().setVisibility(View.VISIBLE);

    }
}
