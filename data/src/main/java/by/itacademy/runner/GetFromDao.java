package by.itacademy.runner;

import by.itacademy.dao.UserDao;
import lombok.Getter;

@Getter
public class GetFromDao {
    public String getDao() {
        UserDao userDao = new UserDao();
        String nameDao;
        String genderDao;
        String creationTimeDao;


        nameDao = userDao.getDefaultUsername().getName();
        genderDao = userDao.getDefaultUsername().getGender().toString();
        creationTimeDao = userDao.getDefaultUsername().getCreationDate().toString();
        System.out.println("Name= " + nameDao + ", Gender: " + genderDao + ", Creation Time: " + creationTimeDao);

        return "Name: " + nameDao + ", Gender: " + genderDao + ", Creation Time: " + creationTimeDao;
    }


}
