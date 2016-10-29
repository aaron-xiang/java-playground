package org.playground;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
    Person person = new Person();

    @Test
    public void setName() throws Exception {
        String name = "Test User";
        person.setName(name);
        Assert.assertEquals("Person name is not equal", name, person.getName());
    }

    @Test
    public void setAge() throws Exception {
        int age = 25;
        person.setAge(age);
        Assert.assertEquals("Person age is not equal", age, person.getAge());

    }

}