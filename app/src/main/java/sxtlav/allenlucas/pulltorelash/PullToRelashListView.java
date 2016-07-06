package sxtlav.allenlucas.pulltorelash;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by AllenLucas on 2016/6/17.
 */
public class PullToRelashListView extends ListView implements AbsListView.OnScrollListener {
    private Myapplication app;
    private View headview,foortview;
    private ImageView headiv,foortiv;
    private int measureheight;
    private TextView tv;
    

    public PullToRelashListView(Context context) {
        this(context,null);
    }

    public PullToRelashListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PullToRelashListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        app = new Myapplication();
        initView();
    }

    private void initView() {
        headview = View.inflate(app.getApplicationContext(), R.layout.headview,null);
        foortview = View.inflate(app.getApplicationContext(), R.layout.headview,null);
        headiv = (ImageView) headview.findViewById(R.id.image);
        foortiv = (ImageView) foortview.findViewById(R.id.image);
        headview.measure(0,0);
        measureheight = headview.getMeasuredHeight();
        setOnScrollListener(this);
        headview.setPadding(0,-measureheight,0,0);
        addHeaderView(headview);
        addFooterView(foortview);
        foortiv.setImageResource(R.drawable.loading);
        tv = (TextView) foortview.findViewById(R.id.tv);
        AnimationDrawable drawable = (AnimationDrawable) foortiv.getDrawable();
        drawable.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){

        }
        return true;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        boolean b = getLastVisiblePosition()+1 == getCount();
        if(b){
            if(listener){

            }
        }
    }
}
