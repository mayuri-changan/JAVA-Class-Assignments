/*Q6. Annotations and reflection
1. Create a annotation CustomAnnotation - This annotation should be used only
with methods and should be retained till runtime
2. annotate method 1 and method 3 in MyClass and invoke only methods which are
annotated
3. Print names of the methods which are not annotated. */

package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
}
