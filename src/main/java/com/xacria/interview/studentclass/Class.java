package com.xacria.interview.studentclass;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Fix the metods so the tests in ClassTest will pass
 */
public class Class {
	private final List<Student> students;

	public Class(List<Student> students) {
		this.students = students;
	}

	public Class() {
		this.students = generateStudents(10);
	}

	Student getBestStudent() {
		Student best = students.get(0);
		for (Student student : students) {
			if (student.grade > best.grade) {
				best = student;
			}
		}
		return best;
	}

	Student getWorsStudent() {
		Student wors = students.get(0);
		for (Student student : students) {
			if (student.grade < wors.grade) {
				wors = student;
			}
		}
		return wors;
	}

	// Return the list of the student with the grade with ascending order
	List<Student> getOrderedStudentList() {
		
		this.students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.grade > o2.grade){
					return -1;
				}
				if(o1.grade < o2.grade){
					return 1;
				}
				return 0;
			}
		});;
		
		return students;
	}

	static List<Student> generateStudents(int count) {
		return IntStream.of(1, count + 1)
				.mapToObj(i -> new Student("Student " + i, (int) Math.round(Math.random() * 30)))
				.collect(Collectors.toList());
	}

}
