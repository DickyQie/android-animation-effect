#  Android动画之进度条
   <div class="blog-body" id="blogBody">
                                    <val data-name="blog_content_type" data-value="richtext"></val>
                    <div class='BlogContent'>
                        <span id="OSC_h2_1"></span>
<h2><span style="color:#800000"><strong>动画实现自定义圆形加载中效果的进度条&nbsp;</strong></span></h2> 
<p>&nbsp;</p> 
<p>Android开发中在处理耗时工作的时候，例如：列表加载，大多数会有一个精度条加载的框，里面有一个像gif的图片在旋转一样。</p> 
<p>&nbsp;</p> 
<p>定义res/anim/loading.xml：</p> 
<p><span style="color:#008080"><strong>&lt;!--</strong></span></p> 
<p><span style="color:#008080"><strong>&nbsp;&nbsp;&nbsp;&nbsp;根标签为animation-list，其中oneshot代表着是否只展示一遍，设置为false会不停的循环播放动画&nbsp;&nbsp;&nbsp;true展示一遍</strong></span></p> 
<p><span style="color:#008080"><strong>&nbsp;&nbsp;&nbsp;&nbsp;根标签下，通过item标签对动画中的每一个图片进行声明&nbsp;</strong></span></p> 
<p><span style="color:#008080"><strong>&nbsp; android:duration&nbsp;表示展示该图片的时间长度&nbsp;</strong></span></p> 
<p><span style="color:#008080"><strong>--&gt;</strong></span></p> 
<p>&nbsp;</p> 
<p>&nbsp;</p> 
<p>&lt;?xmlversion="1.0"encoding="utf-8"?&gt;</p> 
<p>&lt;animation-listxmlns:android="http://schemas.android.com/apk/res/android"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:oneshot="false"&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading1"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading2"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading3"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading4"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading5"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading6"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading7"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading8"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading9"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading10"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading11"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;item</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:drawable="@drawable/loading12"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:duration="100"/&gt;</p> 
<p>&nbsp;</p> 
<p>&lt;/animation-list&gt;</p> 
<p>&nbsp;</p> 
<p>在layout文件中引用如下：</p> 
<p>&lt;?xmlversion="1.0"encoding="utf-8"?&gt;</p> 
<p>&lt;LinearLayoutxmlns:android="http://schemas.android.com/apk/res/android"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="match_parent"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="match_parent"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:background="@android:color/white"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:gravity="center_horizontal"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;android:orientation="vertical"&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;ProgressBar</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/xlistview_footer_progressbar"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="21dp"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="21dp"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_centerInParent="true"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_marginTop="15dp"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:indeterminate="false"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:indeterminateDrawable="@anim/loading"/&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;ImageView</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/imageView1"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_marginTop="50dp"/&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;LinearLayout</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="match_parent"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="wrap_content"&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;Button</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/button1"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:text="启动"/&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;Button</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:id="@+id/button2"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_width="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:layout_height="wrap_content"</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;android:text="暂停"/&gt;</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp;&lt;/LinearLayout&gt;</p> 
<p>&nbsp;</p> 
<p>&lt;/LinearLayout&gt;</p> 
<p>&nbsp;</p> 
<p>&nbsp;</p> 
<p>效果图：</p> 
<p><img alt="" height="217" src="http://images2015.cnblogs.com/blog/1041439/201611/1041439-20161107112237311-1821325101.gif" width="346"></p> 

                  
