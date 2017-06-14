package com.github.vp.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vimalpar on 14/06/17.
 */
public class ReusableTest {
    @Test
    public void shouldVerifyMethodsInClass() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.github.vp.example.Department");
        assertThat(clazz.getMethods()).isNotEmpty();
    }
}
