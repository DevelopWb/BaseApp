package com.appmodle;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.appmodle.navigationFragment.FragmentAdapter;
import com.appmodle.navigationFragment.MainFragmentFactory;
import com.appmodle.viewPage.MyViewPage;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_vp)
    MyViewPage mainVp;
    @BindView(R.id.content_fl)
    FrameLayout contentFl;
    @BindView(R.id.navigation_img1)
    ImageView navigationImg1;
    @BindView(R.id.navigation_tv1)
    TextView navigationTv1;
    @BindView(R.id.navigation_img2)
    ImageView navigationImg2;
    @BindView(R.id.navigation_tv2)
    TextView navigationTv2;
    @BindView(R.id.navigation_img3)
    ImageView navigationImg3;
    @BindView(R.id.navigation_tv3)
    TextView navigationTv3;
    @BindView(R.id.navigation_img4)
    ImageView navigationImg4;
    @BindView(R.id.navigation_tv4)
    TextView navigationTv4;
    @BindView(R.id.navigation_bottom)
    LinearLayout navigationBottom;
    @BindView(R.id.navigation_line1)
    LinearLayout navigationLine1;
    @BindView(R.id.navigation_line2)
    LinearLayout navigationLine2;
    @BindView(R.id.navigation_line3)
    LinearLayout navigationLine3;
    @BindView(R.id.navigation_line4)
    LinearLayout navigationLine4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initBottomViewStatus(0);
        initViewPage();

    }

    private void initViewPage() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainVp.setAdapter(new FragmentAdapter(fragmentManager, MainFragmentFactory.getmFragments()));
        mainVp.setNoScroll(true);
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                initBottomViewStatus(position);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    /**
     * 初始化底部控件的状态
     *
     * @param i
     */
    private void initBottomViewStatus(int i) {
        navigationImg1.setImageResource(R.mipmap.navigation_trade);
        navigationImg2.setImageResource(R.mipmap.navigation_shop);
        navigationImg3.setImageResource(R.mipmap.navigation_car);
        navigationImg4.setImageResource(R.mipmap.navigation_mine);
        navigationTv1.setTextColor(getResources().getColor(R.color.navigition_normal));
        navigationTv2.setTextColor(getResources().getColor(R.color.navigition_normal));
        navigationTv3.setTextColor(getResources().getColor(R.color.navigition_normal));
        navigationTv4.setTextColor(getResources().getColor(R.color.navigition_normal));

        switch (i) {
            case 0:
                navigationImg1.setImageResource(R.mipmap.navigation_trade_press);
                navigationTv1.setTextColor(getResources().getColor(R.color.navigition_press));
                break;
            case 1:
                navigationImg2.setImageResource(R.mipmap.navigation_shop_press);
                navigationTv2.setTextColor(getResources().getColor(R.color.navigition_press));
                break;
            case 2:
                navigationImg3.setImageResource(R.mipmap.navigation_car_press);
                navigationTv3.setTextColor(getResources().getColor(R.color.navigition_press));
                break;
            case 3:
                navigationImg4.setImageResource(R.mipmap.navigation_mine_press);
                navigationTv4.setTextColor(getResources().getColor(R.color.navigition_press));
                break;
            default:
                break;
        }
    }

    @OnClick({R.id.navigation_line1, R.id.navigation_line2, R.id.navigation_line3, R.id.navigation_line4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.navigation_line1:
                mainVp.setCurrentItem(0);
                initBottomViewStatus(0);
                break;
            case R.id.navigation_line2:
                mainVp.setCurrentItem(1);
                initBottomViewStatus(1);
                break;
            case R.id.navigation_line3:
                mainVp.setCurrentItem(2);
                initBottomViewStatus(2);
                break;
            case R.id.navigation_line4:
                mainVp.setCurrentItem(3);
                initBottomViewStatus(3);
                break;
        }
    }
}
