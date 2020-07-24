package taokdao.base.annotation.thread;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 会阻塞线程
 */
@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR, METHOD})
public @interface BlockUI {
}
