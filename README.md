# AndroidAOP
<h3>aop的方式是实现防止按钮多次点击，java和kotlin都能使用</h3>

使用方法很简单，需要几步配置，配置完成之后直接添加注解即可使用，下面是配置方法：</br>
1、在项目的build.gradle中的buildscript中的dependencies添加：

```
 dependencies {
        ...
        classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.4'
    }
```

2、在项目的build.gradle中的allprojects中的repositories添加：
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

3、在app的build.gradle中的最上面添加
```
apply plugin: 'android-aspectjx'
```

4、在app的build.gradle中的dependencies添加
```
implementation 'com.github.zhujiang521:AndroidAOP:1.0.1'
```

<h2>使用方法</h2>
直接在按钮的点击事件上面添加注解即可使用：</br>
在java中：</br>

```
@SingleClick
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnClick2:
                ToastUtils.showShort("哈哈哈");
                Log.e("刘沛星","wwww");
                break;
        }
    }
```

在kotlin中：
```
@SingleClick
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnClick ->{
                    ToastUtils.showShort("哈哈哈")
                    Log.e("刘沛星","wwww")
                }
            }
        }
    }
```

默认间隔时间为1500毫秒，可以自行修改，在注解后面添加括号，在括号中声明需要的时间值即可。
```
@SingleClick(1000)
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btnClick ->{
                    ToastUtils.showShort("哈哈哈")
                    Log.e("刘沛星","wwww")
                }
            }
        }
    }
```

OK。
