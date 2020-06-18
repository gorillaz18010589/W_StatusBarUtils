package com.example.w_statusbarutils;
//目的測試SystemBarTintManager,跳轉道Fragment時導覽列變色功能
//參考網址:https://blog.csdn.net/u014418171/article/details/81223681
/* 1.API : implementation 'com.readystatesoftware.systembartint:systembartint:1.0.3'
   2.寫類別StatusBarUtils
 * */
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.readystatesoftware.systembartint.SystemBarTintManager;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void toPage2(View view) {
        fragmentManager = getSupportFragmentManager();//取得Fragemnt物件經理人(回傳到FragmentManager)
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //開始進行Fragment交易一進一出(回傳到FragmentTransaction)
        fragmentTransaction.add(R.id.contanier,new TestFragment());////新增要選擇加入的Fragment(1.要加入的容器id位置,2要加入的Fragment)
        fragmentTransaction.commit();//執行Fragment的交易
    }
}