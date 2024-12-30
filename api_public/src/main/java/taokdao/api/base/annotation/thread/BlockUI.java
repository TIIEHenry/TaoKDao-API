package taokdao.api.base.annotation.thread;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 会阻塞线程
 */
@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR, METHOD})
public @interface BlockUI {
}
