package com.github.vp.example.domain;

import org.junit.Test;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;

import static java.lang.reflect.Modifier.isPublic;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vimalpar on 14/06/17.
 */
public class ReusableTest {

    @Test
    public void shouldNotHavePublicInstanceFields() throws ClassNotFoundException {
        Reflections reflections = new Reflections("com.github.vp.example.domain", new SubTypesScanner(false));
        Set<String> allTypes = reflections.getAllTypes();
        for (String type : allTypes) {
            validateNoPublicFieldsExist(Class.forName(type));
        }
    }

    private void validateNoPublicFieldsExist(Class<?> aClass) {
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            assertThat(isPublic(field.getModifiers())).as("%s has public field %s", aClass.getCanonicalName(), field.getName()).isFalse();
        }
    }
}
