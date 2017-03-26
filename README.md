# Android之水波纹点击效果(RippleView) 
<div id="article_content" class="article_content">

<p>Android5.0后各种炫的效果纷纷出来，写这篇博客主要是讲的是按钮点击效果带有的水波纹（波浪式）。</p>
<p>当然我写的这个是自定义来实现的，在低版本（5.0一下）也可以实现点击效果。看看效果图：</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <img alt="" src="https://static.oschina.net/uploads/space/2017/0324/171131_dKcx_2945455.gif" height="483" width="594"></p>
<p>上图可看出 点击有抖动效果和不抖动效果。</p>
<p>布局代码：</p>
<p></p>
<pre code_snippet_id="2289255" snippet_file_name="blog_20170324_1_1735243"  code_snippet_id="2289255" snippet_file_name="blog_20170324_1_1735243" name="code" class="html">&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;
&lt;LinearLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
    xmlns:ripple=&quot;http://schemas.android.com/apk/res-auto&quot;
    xmlns:tools=&quot;http://schemas.android.com/tools&quot;
    android:id=&quot;@+id/activity_main&quot;
    android:layout_width=&quot;match_parent&quot;
    android:layout_height=&quot;match_parent&quot;
    android:orientation=&quot;vertical&quot;
    tools:context=&quot;com.zq.waveeffects.MainActivity&quot;&gt;

    &lt;!--其他属性自行测试--&gt;

    &lt;com.zq.waveeffects.RippleView
        android:id=&quot;@+id/more&quot;
        android:layout_width=&quot;?android:actionBarSize&quot;
        android:layout_height=&quot;?android:actionBarSize&quot;
        android:layout_margin=&quot;5dp&quot;
        ripple:rv_centered=&quot;true&quot;&gt;

        &lt;ImageView
            android:layout_width=&quot;88dp&quot;
            android:layout_height=&quot;88dp&quot;
            android:layout_gravity=&quot;center&quot;
            android:background=&quot;@android:color/holo_blue_dark&quot;
            android:padding=&quot;10dp&quot;
            android:src=&quot;@android:drawable/ic_menu_edit&quot; /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width=&quot;wrap_content&quot;
        android:layout_height=&quot;wrap_content&quot;
        android:layout_marginLeft=&quot;25dp&quot;
        android:layout_marginRight=&quot;25dp&quot;
        android:layout_marginTop=&quot;65dp&quot;
        ripple:rv_type=&quot;rectangle&quot;
        ripple:rv_zoom=&quot;true&quot;&gt;
        &lt;!-- ripple:rv_type=&quot;doubleRipple&quot;  控制类型
             ripple:rv_zoom=&quot;true&quot;  是否抖动
        --&gt;
        &lt;TextView
            android:id=&quot;@+id/my_comment_submit&quot;
            android:layout_width=&quot;match_parent&quot;
            android:layout_height=&quot;55dp&quot;
            android:background=&quot;@drawable/border_red_roval_sign&quot;
            android:gravity=&quot;center&quot;
            android:text=&quot;效果1&quot;
            android:textColor=&quot;@android:color/white&quot; /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width=&quot;wrap_content&quot;
        android:layout_height=&quot;wrap_content&quot;
        android:layout_marginLeft=&quot;25dp&quot;
        android:layout_marginRight=&quot;25dp&quot;
        android:layout_marginTop=&quot;15dp&quot;
        ripple:rv_type=&quot;simpleRipple&quot;
        ripple:rv_zoom=&quot;false&quot;&gt;

        &lt;TextView
            android:layout_width=&quot;match_parent&quot;
            android:layout_height=&quot;55dp&quot;
            android:background=&quot;@drawable/border_red_roval_sign&quot;
            android:gravity=&quot;center&quot;
            android:text=&quot;效果2&quot;
            android:textColor=&quot;@android:color/white&quot; /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;

    &lt;com.zq.waveeffects.RippleView
        android:layout_width=&quot;wrap_content&quot;
        android:layout_height=&quot;wrap_content&quot;
        android:layout_marginLeft=&quot;25dp&quot;
        android:layout_marginRight=&quot;25dp&quot;
        android:layout_marginTop=&quot;15dp&quot;
        ripple:rv_type=&quot;doubleRipple&quot;
        ripple:rv_zoom=&quot;false&quot;&gt;

        &lt;TextView
            android:layout_width=&quot;match_parent&quot;
            android:layout_height=&quot;55dp&quot;
            android:background=&quot;@drawable/border_red_roval_sign&quot;
            android:gravity=&quot;center&quot;
            android:text=&quot;效果3&quot;
            android:textColor=&quot;@android:color/white&quot; /&gt;
    &lt;/com.zq.waveeffects.RippleView&gt;
&lt;/LinearLayout&gt;</pre><br>
   
</div>
