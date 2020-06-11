package com.tabdemo.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tabdemo.designpattern.observer.AndroidObervable;
import com.tabdemo.designpattern.observer.PersonObserver;
import com.tabdemo.designpattern.observer.diy.WeatherObervable;
import com.tabdemo.designpattern.observer.diy.WeatherOberver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postObs();
        postDiyObs();
    }


    /**
     * 系统观察者
     */
    private void postObs() {
        PersonObserver xiaoMing = new PersonObserver("xiaoMing");
        PersonObserver xiaoDong = new PersonObserver("xiaoDong");
        PersonObserver xiaoHong = new PersonObserver("xiaoHong");

        // 添加到集合里。
        AndroidObervable android = new AndroidObervable();
        android.addObserver(xiaoMing);
        android.addObserver(xiaoDong);
        android.addObserver(xiaoHong);
        // 通知
        android.postNewVersion("android O updated!");
        android.postNewVersion("android P updated!");
    }

    /**
     * 自定义观察者
     */
    private void postDiyObs() {
        WeatherObervable weatherObervable = new WeatherObervable();
        weatherObervable.add(xiaoMing);
        weatherObervable.add(xiaoDong);
        weatherObervable.rain();
        weatherObervable.typhoon();
    }

    private WeatherOberver xiaoDong = new WeatherOberver() {

        @Override
        public void typhoon() {
            Log.d("xiaoDong","吹台风，要放假了。哈哈！");
        }

        @Override
        public void sun() {
            Log.d("xiaoDong","阳光明媚");
        }

        @Override
        public void rain() {
            Log.d("xiaoDong","下雨了，带伞");
        }
    };

    private WeatherOberver xiaoMing = new WeatherOberver() {

        @Override
        public void typhoon() {
            Log.d("xiaoMing","吹台风，要放假了。哈哈！");
        }

        @Override
        public void sun() {
            Log.d("xiaoMing","阳光明媚");
        }

        @Override
        public void rain() {
            Log.d("xiaoMing","下雨了，带伞");
        }
    };


}
