package zj.it.bhne.androidaop;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.zj.singclick.SingleClick;
import com.zj.test.TestActivity;


public class Main2Activity extends AppCompatActivity{

    private final static String TAG = "Main2Activity";
    //全局定义
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     * 弹窗等待
     *
     * @param view /
     */
    public void btnDialog(View view) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("等待");
        progressDialog.setMessage("等待内容");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

    }

    public void btnStop(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }

    public void btnInter(View view) {
        if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
            lastClickTime = System.currentTimeMillis();
        }
    }

    @SingleClick(2000)
    public void btnAop(View view) {
        ToastUtils.showShort("btnAop");
        Log.e(TAG, "btnAop");
    }

    public void btnKotlin(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
