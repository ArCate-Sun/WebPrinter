# WebPrint

[Windows 在线共享打印机](https://github.com/NewFuture/WebPrint)

a simple website to share your windows printers to others via web browsers.


## 使用方法

### I. 开启IIS 和 ASP支持

如果*已经开启* 或者 *windows server* 可**跳过**此步骤 。

Windows 系统包含IIS功能,但默认关闭，需要手动打开。

可以参考<http://jingyan.baidu.com/article/48206aeaaacd51216ad6b318.html>

具体步骤  
>
  1. 搜索 ,或者打开控制面板
  2. 点击  
  3. 勾选(Internet信息服务) 和 子目录下 
  4. 点击确定,等待开启
>

### II. 下载代码

 1. 下载[代码](https://github.com/NewFuture/WebPrint/archive/master.zip) 
 2. 解压**替换**掉下内容,(确保README.md同级文件在此根目录下)
 3. 浏览器打开  可以看到上传界面

### III. 配置

1. 修改临时文件权限，添加的写入权限
2. 设置打印密码,修改[Web.config](https://github.com/NewFuture/WebPrint/blob/master/Web.config#L5)设置打印密码
3. 设置系统默认打印机即配置完成
4. 局域网其他电脑或手机在浏览器访问你的主机,或可打印则部署成功

## 兼容支持

* 文件格式:
  * [x] PDF
  * [x] doc
  * [x] docx
  * [x] rtf
  * [x] png
  * [x] jpg
  * [x] tiff
  * [x] txt
* 功能设置：
  * [x] 份数设置
  * [x] 页码设置(pdf)
  * [x] 多文件上传

## 截图


## LICENSE

Apache2.0 LICENSE 并保留或添加源码链接

