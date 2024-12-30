package taokdao.api.base.annotation.todo;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * 需要在构造函数外设置
 */
@Documented
@Retention(CLASS)
@Target({FIELD})
public @interface NeedSet {
}
