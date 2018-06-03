# WebPrinter

[在线共享打印机](https://github.com/leleCat/WebPrinter.git)

a simple website to share your windows printers to others via web browsers.


## 使用方法

### I. 安装 Java SE Runtime Environment (jre) 和 Tomcat

### II. 下载 SumatraPDF.exe

### III. 下载代码

 1. 下载[代码](https://codeload.github.com/leleCat/WebPrinter/zip/master)
 2. 更改配置文件 /src/main/resources/config.properties 中 SumatraPDF.exe 和待打印文件的临时存放路径
 2. 将编译后的 war 文件放入 tomcat 的应用程序工作路径中 (默认 {tomcat根路径}/webapp/)
 3. 启动 tomcat


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

## 功能

### I. 过接收网络请求打印文件

(1) 打印文件
* [POST] /print
  * Body
    * file		[File]	待打印文件
    * password	[Text]	打印机密码
    * copies	[Text]	打印页数
    * range		[Text]	仅PDF文件可用, 表页码范围, 如 "1-5"
    