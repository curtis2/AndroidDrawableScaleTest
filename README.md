# AndroidDrawableScaleTest
测试不同drawable文件夹中的图片资源在不同密度的设备上的加载规则


测试结果：
  -   1.图片本身大小为 532x400 放置在xxhdpi下，运行在xxhdpi（320dpi ~ 480dpi）密度的设备上，显示的大小为532x400
  -   2.图片本身大小为 532x400 放置在xhdpi(240dpi ~ 320dpi)下，运行在xxhdpi（320dpi ~ 480dpi）密度的设备上，图片被放大，显示的大小为798x600
  -   3.图片本身大小为 532x400 放置在xxxhdpi(480dpi ~ 640dpi)下，运行在xxhdpi（320dpi ~ 480dpi）密度的设备上，图片被缩小，显示的大小为399x300
    
    
 结论：
   -   1.图片加载的优先级为 先加载对应设备密度下的图片资源 比如设备密度为xhdpi 那么就会先加载xhdpi下的图片资源
        如果没有对应的密度资源图片，那先向高密度去找，如果没有，去drawable-nodpi找，如果还没有，就依次向低密度找。
        
   -   2.加载比设备密度低的drawable文件夹下的资源，图片会被放大。放大的比例为   例：测试结果2为例，宽度和高度都放大了 480/320=1.5倍
       
        原因：当系统在低于设备密度的drawable的文件夹中找到对应的图片，系统会认为这张图是专门为低密度设计的，如果直接在高密度的设备上使用就会出现像素过低的情况，
        所以系统会自动做这样一个放大操作。
        
        加载比设备密度高的drawable文件夹下的资源，图片会被缩小，缩小的比例为 例：测试结果3为例，宽度都缩小了 640/480=1.3倍
        
        原因：当系统在高于设备密度的drawable的文件夹中找到对应的图片，系统会认为这张图是专门为高密度设计的，如果直接在低密度的设备上使用就会出现像素过高的情况，
                所以系统会自动做这样一缩小操作。
        
   -   3.图片被拉伸后，占用的内存变多了。     
    
----------


 **不同密度的划分：**
 ![这里写图片描述](http://img.blog.csdn.net/20170927165745061?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbmlnaHRjdXJ0aXM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)  
 


----------


**不同密度的mipmap_drawable的icon推荐尺寸：**
![这里写图片描述](http://img.blog.csdn.net/20170927165819367?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbmlnaHRjdXJ0aXM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
    
    ---- 
    参考：http://blog.csdn.net/guolin_blog/article/details/50727753
    