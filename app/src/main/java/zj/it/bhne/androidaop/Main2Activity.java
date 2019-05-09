package zj.it.bhne.androidaop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.blankj.utilcode.util.ToastUtils;
import com.zj.singclick.SingleClick;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button zhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        zhu = (Button) findViewById(R.id.zhu);

        zhu.setOnClickListener(this);
    }

    @Override
    @SingleClick
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zhu:
                ToastUtils.showShort("sssss");
                Log.e("刘佩希","wwww");
                break;
        }
    }
}
