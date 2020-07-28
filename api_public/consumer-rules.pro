-keep class taokdao.api.*.*{
*;
}

-keep public class * extends taokdao.api.*

 # 不进行预校验,Android不需要,可加快混淆速度。
-dontpreverify
# 保护代码中的Annotation不被混淆
-keepattributes *Annotation*
# 避免混淆泛型, 这在JSON实体映射时非常重要
-keepattributes Signature