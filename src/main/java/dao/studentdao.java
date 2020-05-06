package dao;

import entity.student;

public interface studentdao {
    public student login(student s);
    public int addstudent(student s);
    public int updatestudent(student s);
    public int delstudent(int s);

}
