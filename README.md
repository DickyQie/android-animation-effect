# Android之水波纹点击效果(RippleView) 
<div id="cnblogs_post_body"><p>Android5.0后各种炫的效果纷纷出来，写这篇博客主要是讲的是按钮点击效果带有的水波纹（波浪式）。</p>
<p>当然我写的这个是自定义来实现的，在低版本（5.0一下）也可以实现点击效果。看看效果图：</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img src="https://static.oschina.net/uploads/space/2017/0324/171131_dKcx_2945455.gif" alt="" width="594" height="483"></p>
<p>上图可看出 点击有抖动效果和不抖动效果。</p>
<p>布局代码：</p>
<div class="cnblogs_code">
<pre><span style="color: #0000ff">&lt;?</span><span style="color: #ff00ff">xml version="1.0" encoding="utf-8"</span><span style="color: #0000ff">?&gt;</span>
<span style="color: #0000ff">&lt;</span><span style="color: #800000">LinearLayout </span><span style="color: #ff0000">xmlns:android</span><span style="color: #0000ff">="http://schemas.android.com/apk/res/android"</span><span style="color: #ff0000">
    xmlns:ripple</span><span style="color: #0000ff">="http://schemas.android.com/apk/res-auto"</span><span style="color: #ff0000">
    xmlns:tools</span><span style="color: #0000ff">="http://schemas.android.com/tools"</span><span style="color: #ff0000">
    android:id</span><span style="color: #0000ff">="@+id/activity_main"</span><span style="color: #ff0000">
    android:layout_width</span><span style="color: #0000ff">="match_parent"</span><span style="color: #ff0000">
    android:layout_height</span><span style="color: #0000ff">="match_parent"</span><span style="color: #ff0000">
    android:orientation</span><span style="color: #0000ff">="vertical"</span><span style="color: #ff0000">
    tools:context</span><span style="color: #0000ff">="com.zq.waveeffects.MainActivity"</span><span style="color: #0000ff">&gt;</span>

    <span style="color: #008000">&lt;!--</span><span style="color: #008000">其他属性自行测试</span><span style="color: #008000">--&gt;</span>

    <span style="color: #0000ff">&lt;</span><span style="color: #800000">com</span><span style="color: #ff0000">.zq.waveeffects.RippleView
        android:id</span><span style="color: #0000ff">="@+id/more"</span><span style="color: #ff0000">
        android:layout_width</span><span style="color: #0000ff">="?android:actionBarSize"</span><span style="color: #ff0000">
        android:layout_height</span><span style="color: #0000ff">="?android:actionBarSize"</span><span style="color: #ff0000">
        android:layout_margin</span><span style="color: #0000ff">="5dp"</span><span style="color: #ff0000">
        ripple:rv_centered</span><span style="color: #0000ff">="true"</span><span style="color: #0000ff">&gt;</span>

        <span style="color: #0000ff">&lt;</span><span style="color: #800000">ImageView
            </span><span style="color: #ff0000">android:layout_width</span><span style="color: #0000ff">="88dp"</span><span style="color: #ff0000">
            android:layout_height</span><span style="color: #0000ff">="88dp"</span><span style="color: #ff0000">
            android:layout_gravity</span><span style="color: #0000ff">="center"</span><span style="color: #ff0000">
            android:background</span><span style="color: #0000ff">="@android:color/holo_blue_dark"</span><span style="color: #ff0000">
            android:padding</span><span style="color: #0000ff">="10dp"</span><span style="color: #ff0000">
            android:src</span><span style="color: #0000ff">="@android:drawable/ic_menu_edit"</span> <span style="color: #0000ff">/&gt;</span>
    <span style="color: #0000ff">&lt;/</span><span style="color: #800000">com.zq.waveeffects.RippleView</span><span style="color: #0000ff">&gt;</span>

    <span style="color: #0000ff">&lt;</span><span style="color: #800000">com</span><span style="color: #ff0000">.zq.waveeffects.RippleView
        android:layout_width</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_height</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_marginLeft</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginRight</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginTop</span><span style="color: #0000ff">="65dp"</span><span style="color: #ff0000">
        ripple:rv_type</span><span style="color: #0000ff">="rectangle"</span><span style="color: #ff0000">
        ripple:rv_zoom</span><span style="color: #0000ff">="true"</span><span style="color: #0000ff">&gt;</span>
        <span style="color: #008000">&lt;!--</span><span style="color: #008000"> ripple:rv_type="doubleRipple"  控制类型
             ripple:rv_zoom="true"  是否抖动
        </span><span style="color: #008000">--&gt;</span>
        <span style="color: #0000ff">&lt;</span><span style="color: #800000">TextView
            </span><span style="color: #ff0000">android:id</span><span style="color: #0000ff">="@+id/my_comment_submit"</span><span style="color: #ff0000">
            android:layout_width</span><span style="color: #0000ff">="match_parent"</span><span style="color: #ff0000">
            android:layout_height</span><span style="color: #0000ff">="55dp"</span><span style="color: #ff0000">
            android:background</span><span style="color: #0000ff">="@drawable/border_red_roval_sign"</span><span style="color: #ff0000">
            android:gravity</span><span style="color: #0000ff">="center"</span><span style="color: #ff0000">
            android:text</span><span style="color: #0000ff">="效果1"</span><span style="color: #ff0000">
            android:textColor</span><span style="color: #0000ff">="@android:color/white"</span> <span style="color: #0000ff">/&gt;</span>
    <span style="color: #0000ff">&lt;/</span><span style="color: #800000">com.zq.waveeffects.RippleView</span><span style="color: #0000ff">&gt;</span>

    <span style="color: #0000ff">&lt;</span><span style="color: #800000">com</span><span style="color: #ff0000">.zq.waveeffects.RippleView
        android:layout_width</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_height</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_marginLeft</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginRight</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginTop</span><span style="color: #0000ff">="15dp"</span><span style="color: #ff0000">
        ripple:rv_type</span><span style="color: #0000ff">="simpleRipple"</span><span style="color: #ff0000">
        ripple:rv_zoom</span><span style="color: #0000ff">="false"</span><span style="color: #0000ff">&gt;</span>

        <span style="color: #0000ff">&lt;</span><span style="color: #800000">TextView
            </span><span style="color: #ff0000">android:layout_width</span><span style="color: #0000ff">="match_parent"</span><span style="color: #ff0000">
            android:layout_height</span><span style="color: #0000ff">="55dp"</span><span style="color: #ff0000">
            android:background</span><span style="color: #0000ff">="@drawable/border_red_roval_sign"</span><span style="color: #ff0000">
            android:gravity</span><span style="color: #0000ff">="center"</span><span style="color: #ff0000">
            android:text</span><span style="color: #0000ff">="效果2"</span><span style="color: #ff0000">
            android:textColor</span><span style="color: #0000ff">="@android:color/white"</span> <span style="color: #0000ff">/&gt;</span>
    <span style="color: #0000ff">&lt;/</span><span style="color: #800000">com.zq.waveeffects.RippleView</span><span style="color: #0000ff">&gt;</span>

    <span style="color: #0000ff">&lt;</span><span style="color: #800000">com</span><span style="color: #ff0000">.zq.waveeffects.RippleView
        android:layout_width</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_height</span><span style="color: #0000ff">="wrap_content"</span><span style="color: #ff0000">
        android:layout_marginLeft</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginRight</span><span style="color: #0000ff">="25dp"</span><span style="color: #ff0000">
        android:layout_marginTop</span><span style="color: #0000ff">="15dp"</span><span style="color: #ff0000">
        ripple:rv_type</span><span style="color: #0000ff">="doubleRipple"</span><span style="color: #ff0000">
        ripple:rv_zoom</span><span style="color: #0000ff">="false"</span><span style="color: #0000ff">&gt;</span>

        <span style="color: #0000ff">&lt;</span><span style="color: #800000">TextView
            </span><span style="color: #ff0000">android:layout_width</span><span style="color: #0000ff">="match_parent"</span><span style="color: #ff0000">
            android:layout_height</span><span style="color: #0000ff">="55dp"</span><span style="color: #ff0000">
            android:background</span><span style="color: #0000ff">="@drawable/border_red_roval_sign"</span><span style="color: #ff0000">
            android:gravity</span><span style="color: #0000ff">="center"</span><span style="color: #ff0000">
            android:text</span><span style="color: #0000ff">="效果3"</span><span style="color: #ff0000">
            android:textColor</span><span style="color: #0000ff">="@android:color/white"</span> <span style="color: #0000ff">/&gt;</span>
    <span style="color: #0000ff">&lt;/</span><span style="color: #800000">com.zq.waveeffects.RippleView</span><span style="color: #0000ff">&gt;</span>
<span style="color: #0000ff">&lt;/</span><span style="color: #800000">LinearLayout</span><span style="color: #0000ff">&gt;</span></pre>
</div>
