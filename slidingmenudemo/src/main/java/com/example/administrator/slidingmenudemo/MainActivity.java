package com.example.administrator.slidingmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {
    private SlidingMenu slidingMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slidingMenu = new SlidingMenu(this);
        //设置在左边
        slidingMenu.setMode(SlidingMenu.LEFT);
        //设置触摸模式  可以选择全屏划出 或者是边缘划出
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //绑定一个Avtivity
        slidingMenu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
        //设置侧滑栏完全展开之后 举例另一边的举例 设置越大 侧滑栏的宽度约小
        slidingMenu.setBehindOffset(150);
        //slidingMenu.setBehindOffset(R.dimen.activity_sliding_menu);
       slidingMenu.setFadeDegree(0.3f);
        //设置视图资源
        slidingMenu.setMenu(R.layout.sliding_item);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_MENU:
           // slidingMenu.toggle(true);
                Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
            break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
