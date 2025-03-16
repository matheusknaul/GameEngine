package com.matheusknaul.GameEngine.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
	String name();
	String type();
	boolean primaryKey() default false;
}
