
-keep class androidx**
-keep interface androidx**
-keep enum androidx**

-keep class androidx**{
    *;
}
-keep interface androidx**{
    *;
}
-keep enum androidx**{
    *;
}

-keep class com.google.android.material**
-keep interface com.google.android.material**
-keep enum com.google.android.material**

-keep class com.google.android.material**{
    *;
}
-keep interface com.google.android.material**{
    *;
}
-keep enum com.google.android.material**{
    *;
}

#指定代码的压缩级别，在0-7之间，一般是5，不需要修改
-optimizationpasses 5

#混淆时不使用大小写混合，混淆后的类名为小写
-dontusemixedcaseclassnames

# Android不需要预校验
-dontpreverify

#有了verbose这句话，混淆后就会生成映射文件
# 包含有类名->混淆后类名的映射关系
# 然后使用printmapping指定映射文件的名称
-verbose
#-printmapping proguardMapping.txt

#混淆时所采用的算法，后面的参数是一个过滤器
#这个过滤器是谷歌推荐的算法，一般不改变
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

# 保护代码中的Annotation不被混淆，这在JSON实体映射时非常重要，比如fastJson
-keepattributes *Annotation*

#避免混淆泛型，这在JSON实体映射时非常重要，比如fastJson
-keepattributes Signature

#抛出异常时保留代码行号，在异常分析中可以方便定位
-keepattributes SourceFile,LineNumberTable

#用于告诉ProGuard，不要跳过对非公开类的处理。默认情况下是跳过的，因为程序中不会引用它们，有些情况下人们编写的代码与类库中的类在同一个包下，并且对包中内容加以引用，此时需要加入此条声明
-dontskipnonpubliclibraryclasses

#这个是给Microsoft Windows用户的，因为ProGuard假定使用的操作系统是能区分两个只是大小写不同的文件名，但是Microsoft Windows不是这样的操作系统，所以必须为ProGuard指定-dontusemixedcaseclassnames选项
-dontusemixedcaseclassnames

##################################保留############################

#保持native方法不被混淆
#keepclasseswithmembernames 保留类和该类中所有带native限定符的方法
-keepclasseswithmembernames class * {
    native <methods>;
}

#保留了继承自Activity、Application这些类的子类
# 因为这些子类，都有可能被外部调用
# 比如说，第一行就保证了所有Activity的子类不要被混淆
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class * extends android.support.v4.**
-keep public class * extends android.view.View
-keep public class com.android.vending.licensing.ILicensingService


# 保留自定义控件（继承自View）不被混淆
-keep public class * extends android.view.View {
    *** get*();
    void set*(***);
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

#枚举enum类不能被混淆
-keepclassmembers enum * {
    #这两个方法用到了反射
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

#保留Parcelable序列化的类不被混淆
-keep class * implements android.os.Parcelable { # 保持 Parcelable 不被混淆
    public static final android.os.Parcelable.Creator *;
}

# 保留Serializable序列化的类不被混淆
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# 对于R（资源）下的所有类及其方法，都不能被混淆
-keep class **.R$* {
    *;
}

# 对于带有回调函数onXXEvent的，不能被混淆
-keepclassmembers class * {
    void *(**On*Event);
}