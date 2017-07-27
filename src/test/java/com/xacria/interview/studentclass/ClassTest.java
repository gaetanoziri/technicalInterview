package com.xacria.interview.studentclass;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by fre on 18/07/17.
 */
public class ClassTest extends Assert {

    @Test
    public void test(){
        List<Student> students = Lists.newArrayList(new Student("A", 10), new Student("B", 1), new Student("C" , 20));
        Class studentClass = new Class(students);
        assertEquals(studentClass.getBestStudent().name, "C");
        assertEquals(studentClass.getWorsStudent().name, "B");
        assertEquals(studentClass.getOrderedStudentList().get(2).name, "B");
        assertEquals(studentClass.getOrderedStudentList().get(0).name, "C");
        assertEquals(studentClass.getOrderedStudentList().get(1).name, "A");
    }


}
