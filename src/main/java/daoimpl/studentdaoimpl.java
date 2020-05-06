package daoimpl;

import dao.studentdao;
import entity.student;
import util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class studentdaoimpl extends BaseDao implements studentdao {
    @Override
    public student login(student s) {
        student st=null;
        String sql="SELECT * FROM student WHERE NAME=? AND PASSWORD=?";
        ResultSet dd=super.cha(sql,s.getName(),s.getPassword());

            try {
                while(dd.next()) {
                    String name=dd.getString(2);
                    String pass=dd.getString(3);
                    Long age=dd.getLong(4);
                    String miao=dd.getString(5);
                    String sex=dd.getString(6);
                    st=new student(name,pass,age,miao,sex);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        return st;
    }

    @Override
    public int addstudent(student s) {
        String sql="INSERT student(student.NAME,student.PASSWORD,student.age,student.description,student.sex) VALUES (?,?,?,?,?)";
        return super.zsg(sql,s.getName(),s.getPassword(),s.getAge(),s.getDescription(),s.getSex());
    }

    @Override
    public int updatestudent(student s) {
        return 0;
    }

    @Override
    public int delstudent(int s) {
        String sql="DELETE FROM student WHERE id=?";
        return super.zsg(sql,s);
    }
}
