package commonlibrary.system;

/**
 * @author lfj  2015年8月20日
 * @Description: 取得本机的全部环境属性---或指定得到具体信息
 */
public class Demo02 {
	public static void main(String[] args) {
//		System.getProperties().list(System.out); //列出系统的全部环境
		System.out.println("系统版本为："+System.getProperty("os.name"));
		System.out.println("系统用户为："+System.getProperty("user.name"));
		System.out.println("当前用户工作目录："+System.getProperty("user.dir"));
	}
}

//能看到的信有
//-- listing properties --
//java.runtime.name=Java(TM) SE Runtime Environment
//sun.boot.library.path=C:\JDK\jre1.8.0\bin
//java.vm.version=25.31-b07
//java.vm.vendor=Oracle Corporation
//java.vendor.url=http://java.oracle.com/
//path.separator=;
//java.vm.name=Java HotSpot(TM) 64-Bit Server VM
//file.encoding.pkg=sun.io
//user.script=
//user.country=CN
//sun.java.launcher=SUN_STANDARD
//sun.os.patch.level=Service Pack 1
//java.vm.specification.name=Java Virtual Machine Specification
//user.dir=D:\workspace1\Junit4Demo
//java.runtime.version=1.8.0_31-b13
//java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
//java.endorsed.dirs=C:\JDK\jre1.8.0\lib\endorsed
//os.arch=amd64
//java.io.tmpdir=C:\Users\lfj\AppData\Local\Temp\
//line.separator=
//
//java.vm.specification.vendor=Oracle Corporation
//user.variant=
//os.name=Windows 7
//sun.jnu.encoding=GBK
//java.library.path=C:\JDK\jre1.8.0\bin;C:\Windows\Sun\Ja...
//java.specification.name=Java Platform API Specification
//java.class.version=52.0
//sun.management.compiler=HotSpot 64-Bit Tiered Compilers
//os.version=6.1
//user.home=C:\Users\lfj
//user.timezone=
//java.awt.printerjob=sun.awt.windows.WPrinterJob
//file.encoding=GBK---------------------------------------------文件默认编码
//java.specification.version=1.8
//user.name=lfj
//java.class.path=D:\workspace1\Junit4Demo\bin;C:\eclip...
//java.vm.specification.version=1.8
//sun.arch.data.model=64
//java.home=C:\JDK\jre1.8.0
//sun.java.command=commonlibrary.system.Demo02
//java.specification.vendor=Oracle Corporation
//user.language=zh
//awt.toolkit=sun.awt.windows.WToolkit
//java.vm.info=mixed mode
//java.version=1.8.0_31
//java.ext.dirs=C:\JDK\jre1.8.0\lib\ext;C:\Windows\Su...
//sun.boot.class.path=C:\JDK\jre1.8.0\lib\resources.jar;C:\...
//java.vendor=Oracle Corporation
//file.separator=\--------------------------------------------------文件分隔符
//java.vendor.url.bug=http://bugreport.sun.com/bugreport/
//sun.cpu.endian=little
//sun.io.unicode.encoding=UnicodeLittle
//sun.desktop=windows
//sun.cpu.isalist=amd64