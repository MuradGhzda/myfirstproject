/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Student;
import config.Base;

/**
 *
 * @author USER
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Adini daxil edin:");
        String surname = InputUtil.requireText("Soyadini daxil edin:");
        int age = InputUtil.requireNumber("Yasini daxil edin:");
        String group = InputUtil.requireText("Qrupunu daxil edin:");
        Student st = new Student(name, surname, group, age);
        return st;

    }

    public static void registerStudent() {
        int say = InputUtil.requireNumber("Nece telebe elave etmek isteyirsiniz?");
        Base.students = new Student[say];
        for (int i = 0; i < say; i++) {
            System.out.println((i + 1) + ".Telebe");

            Base.students[i] = StudentUtil.fillStudent();
        }

    }

    public static void showAllStudents() {
        for (int i = 0; i < Base.students.length; i++) {
            System.out.println((i + 1) + "." + Base.students[i]);
        }

    }
}
