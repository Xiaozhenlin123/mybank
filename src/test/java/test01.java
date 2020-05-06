import dao.studentdao;
import daoimpl.studentdaoimpl;
import entity.student;

public class test01 {

    public static void main(String[] args) {
        studentdao m=new studentdaoimpl();
        student l=new student("密码","111111", (long) 34,"科技局","男");
        m.addstudent(l);
        student mm=m.login(new student("密码","111111"));
        System.out.println(mm);
    }
}
