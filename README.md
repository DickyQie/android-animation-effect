# Android之水波纹点击效果(RippleView) 
                     <p>Android5.0后各种炫的效果纷纷出来，写这篇博客主要是讲的是按钮点击效果带有的水波纹（波浪式）。</p> 
<p>当然我写的这个是自定义来实现的，在低版本（5.0一下）也可以实现点击效果。看看效果图：</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img alt="" height="483" src="https://static.oschina.net/uploads/space/2017/0324/171131_dKcx_2945455.gif" width="594"></p> 
<p>上图可看出 点击有抖动效果和不抖动效果。</p> 
<p>布局代码：</p> 
<pre><code class="language-html">&lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:ripple="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.zq.waveeffects.MainActivity"&gt;

    &lt;!--其他属性自行测试--&gt;

    &lt;com.zq.waveeffects.RippleView
        android:id="@+id/more"
        android:layout_width="?android:actionBarSize"
        android:layout_height="?android:actionBarSize"
        android:layout_margin="5dp"
        ripple:rv_centered="true"&gt;

        &lt;ImageView
            android:layout_width="88dp"
            android:layout_height="88dp"
            android:layout_gravity="center"
            android:background="@android:color/holo_blue_dark"
            android:padding="10dp"
            android:src="@android:drawable/ic_menu_edit" /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="25dp"
        android:layout_marginRight="25dp"
        android:layout_marginTop="65dp"
        ripple:rv_type="rectangle"
        ripple:rv_zoom="true"&gt;
        &lt;!-- ripple:rv_type="doubleRipple"  控制类型
             ripple:rv_zoom="true"  是否抖动
        --&gt;
        &lt;TextView
            android:id="@+id/my_comment_submit"
            android:layout_width="match_parent"
            android:layout_height="55dp"
            android:background="@drawable/border_red_roval_sign"
            android:gravity="center"
            android:text="效果1"
            android:textColor="@android:color/white" /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="25dp"
        android:layout_marginRight="25dp"
        android:layout_marginTop="15dp"
        ripple:rv_type="simpleRipple"
        ripple:rv_zoom="false"&gt;

        &lt;TextView
            android:layout_width="match_parent"
            android:layout_height="55dp"
            android:background="@drawable/border_red_roval_sign"
            android:gravity="center"
            android:text="效果2"
            android:textColor="@android:color/white" /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="25dp"
        android:layout_marginRight="25dp"
        android:layout_marginTop="15dp"
        ripple:rv_type="doubleRipple"
        ripple:rv_zoom="false"&gt;

        &lt;TextView
            android:layout_width="match_parent"
            android:layout_height="55dp"
            android:background="@drawable/border_red_roval_sign"
            android:gravity="center"
            android:text="效果3"
            android:textColor="@android:color/white" /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;
&lt;/LinearLayout&gt;
</code></pre> 
<p>自定义的RippleView代码比较多，直接下载源码即可；</p> 
<span id="OSC_h1_1"></span>
