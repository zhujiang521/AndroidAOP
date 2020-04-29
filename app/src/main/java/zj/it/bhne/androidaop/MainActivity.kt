package zj.it.bhne.androidaop

import android.os.Bundle

import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ToastUtils
import com.zj.singclick.SingleClick
import com.zj.singclick.click
import com.zj.singclick.setSafeListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClick.setOnClickListener(this)
        initView()
    }

    private fun initView() {
        btnKuoZhan.setSafeListener {
            ToastUtils.showShort("222")
            Log.e("kuozhan","wwww")
        }

        btnKuoZhanClick.click {
            ToastUtils.showShort("ss")
            Log.e("kuozhan","呵呵呵")
        }
    }


    @SingleClick
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnClick->{
                    ToastUtils.showShort("哈哈哈")
                    Log.e("ee","wwww")
                }
            }
        }
    }

}
