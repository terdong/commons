package me.saro.commons.bytes.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  text data in FixedDataFormat
 * @author      PARK Yong Seo
 * @since       1.4
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FixedDate {
    
    /**
     * FixedDateType
     * @return
     */
    FixedDateType type() default FixedDateType.textFormat;
    
    /**
     * offset
     * @return
     */
    int offset() default -1;
    
    /**
     * byte length<br>
     * exclusive use in the FixedDateType.textFormat
     * @return
     */
    int length() default -1;
    
    /**
     * date format<br>
     * exclusive use in the FixedDateType.textFormat
     * @return
     */
    String format() default "";
}
