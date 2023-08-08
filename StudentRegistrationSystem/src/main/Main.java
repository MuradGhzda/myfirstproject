package main;

import bean.Student;
import config.Base;
import util.InputUtil;
import util.StudentUtil;

public class Main {

    public static void main(String[] args) {

        while (true) {
            int menu = InputUtil.requireNumber("""
                           Menyudan prosesi sec:
                             1.Telebe elave et
                             2.Telebeleri goster
                             3.Telebe axtar
                             4.Melumat deyis
                             5.Cix """);

            if (menu == 1) {
                StudentUtil.registerStudent();

            } else if (menu == 2) {

                StudentUtil.showAllStudents();

            }
            else if (menu ==3) {
                
                
                
            }
        }

    }

}
