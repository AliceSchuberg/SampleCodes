package com.alicer.springdemo;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PhoneApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Phone myiPhone = context.getBean("phone",Phone.class);
        AndroidPhone myAndroid = context.getBean("phone1",AndroidPhone.class);
        //System.out.println(myiPhone.getCPUFramework());
        System.out.println("2# phone: "+myAndroid.getCPUFramework()+", "
                +myAndroid.getBrand()+", "
                +myAndroid.getCountry());
        context.close();
    }
}
