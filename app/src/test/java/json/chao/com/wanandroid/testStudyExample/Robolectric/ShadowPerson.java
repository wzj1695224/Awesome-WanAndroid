package json.chao.com.wanandroid.testStudyExample.Robolectric;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

import json.chao.com.wanandroid.test.Person;



@Implements(Person.class)
public class ShadowPerson {

    @Implementation
    public String getName() {
        return "JsonChao";
    }

    @Implementation
    public int getAge() {
        return 25;
    }

}
