package com.github.vp.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vimalpar on 14/06/17.
 */
public class DepartmentTest {
    @Test
    public void shouldReturnTrueForDepartmentsWithSameId() {
        Department dept1 = new Department("1", "Dept1");
        Department dept2 = new Department("1", "Dept2");

        assertThat(dept1.equals(dept2)).isTrue();
    }

    @Test
    public void shouldReturnFalseForDepartmentsWithDifferentId() {
        Department dept1 = new Department("1", "Dept");
        Department dept2 = new Department("2", "Dept");

        assertThat(dept1.equals(dept2)).isFalse();
    }
}