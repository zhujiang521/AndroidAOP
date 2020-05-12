# AndroidAOP

> AOP的方式实现防止按钮多次点击，Java和Kotlin都能使用。

使用方法很简单，需要几步配置，配置完成之后直接添加注解即可使用，下面是配置方法：

## 引入

1. 在项目的`build.gradle`中的`buildscript`中的`dependencies`添加：

```
dependencies {
    ...
    classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.4'
}
```

2. 在项目的`build.gradle`中的`allprojects`中的`repositories`添加：

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

3. 在`app`的`build.gradle`中的最上面添加

```
apply plugin: 'android-aspectjx'
```

4. 在`app`的`build.gradle`中的`dependencies`添加
[![](https://jitpack.io/v/zhujiang521/AndroidAOP.svg)](https://jitpack.io/#zhujiang521/AndroidAOP)

```
implementation 'com.github.zhujiang521:AndroidAOP:1.1.1'
```

## 使用方法

直接在按钮的点击事件上面添加注解即可使用。

在`Java`中：

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

在`Kotlin`中：

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

默认间隔时间为`1500`毫秒，可以自行修改，在注解后面添加括号，在括号中声明需要的时间值即可。

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

新增了`Kotlin`的判断重复的方法，大家可以按照下面的方法直接进行调用，比写注解更加灵活方便：

```
btnKuoZhan.setSafeListener {
    ToastUtils.showShort("222")
    Log.e("kuozhan","wwww")
}
```
