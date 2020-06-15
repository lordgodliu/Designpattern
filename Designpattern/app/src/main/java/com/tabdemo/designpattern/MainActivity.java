package com.tabdemo.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tabdemo.designpattern.abs_factory.Factory;
import com.tabdemo.designpattern.abs_factory.HWPhone;
import com.tabdemo.designpattern.abs_factory.XIMIPhone;
import com.tabdemo.designpattern.abs_factory.component;
import com.tabdemo.designpattern.builder.MyBuild;
import com.tabdemo.designpattern.builder.MyData;
import com.tabdemo.designpattern.command.BakeChickenWingCommand;
import com.tabdemo.designpattern.command.BakeMuttonCommand;
import com.tabdemo.designpattern.command.Barbecuer;
import com.tabdemo.designpattern.command.Command;
import com.tabdemo.designpattern.command.Waiter;
import com.tabdemo.designpattern.factory.MyFactory;
import com.tabdemo.designpattern.factory.Product;
import com.tabdemo.designpattern.observer.AndroidObervable;
import com.tabdemo.designpattern.observer.PersonObserver;
import com.tabdemo.designpattern.observer.diy.WeatherObervable;
import com.tabdemo.designpattern.observer.diy.WeatherOberver;
import com.tabdemo.designpattern.proxy.Image;
import com.tabdemo.designpattern.proxy.ProxyImage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0://build模式
                Log.d(TAG, "-----------------------------------------------------------------");
                MyData asknf = new MyBuild().setName("移动电话：").setId(10080).build();
                Log.d(TAG, "onClick: build模式==>"+ asknf.toString());
                break;

            case R.id.btn1://代理模式
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 代理模式");
                proxy();
                break;

            case R.id.btn2://系统观察者
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 系统观察者");
                postObs();
                break;

            case R.id.btn3://自定义观察者
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 自定义观察者");
                postDiyObs();
                break;
            case R.id.btn4://工厂
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 工厂==》tag==1");
                MyFactory myFactory = new MyFactory();
                myFactory.CreateProduct(1).methd();
                break;
            case R.id.btn5://抽象工厂
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 抽象工厂==》华为手机");
                HWPhone hwPhone = new HWPhone();
                hwPhone.createCPU().showCpuName();
                hwPhone.createBattery().showBatteryName();
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 抽象工厂==》小米手机");
                XIMIPhone ximiPhone = new XIMIPhone();
                ximiPhone.createCPU().showCpuName();
                ximiPhone.createBattery().showBatteryName();
                break;

            case R.id.btn6://命令模式
                Log.d(TAG, "-----------------------------------------------------------------");
                Log.d(TAG, "onClick: 命令模式");
                initCommand();
                break;
        }
    }

    /**
     * 命令模式2
     */
    private void initCommand() {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();
        girl.setOrders(bakeMuttonCommand1);
        girl.setOrders(bakeMuttonCommand2);
        girl.setOrders(bakeChickenWingCommand);
        girl.notifyA();
    }


    /**
     * 代理模式测试
     */
    private void proxy() {
        Image mImage1 = new ProxyImage("My.Image1");
        Image mImage2 = new ProxyImage("My.Image2");
        mImage1.displayImage();
        mImage2.displayImage();
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
            Log.d("xiaoDong", "吹台风，要放假了。哈哈！");
        }

        @Override
        public void sun() {
            Log.d("xiaoDong", "阳光明媚");
        }

        @Override
        public void rain() {
            Log.d("xiaoDong", "下雨了，带伞");
        }
    };

    private WeatherOberver xiaoMing = new WeatherOberver() {

        @Override
        public void typhoon() {
            Log.d("xiaoMing", "吹台风，要放假了。哈哈！");
        }

        @Override
        public void sun() {
            Log.d("xiaoMing", "阳光明媚");
        }

        @Override
        public void rain() {
            Log.d("xiaoMing", "下雨了，带伞");
        }
    };


}
