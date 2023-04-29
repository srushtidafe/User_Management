package com.example.UserValidation.Repository;
import com.example.UserValidation.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
     List<User> UserList;

    public UserDao()
    {
        System.out.println("This is a Dummy User");
        UserList = new ArrayList<>() ;
//       UserList.add(new User("2000-10-10" ,"10:15:30","0","Rushit","2000-11-10" ,"srushtidafe2000@gmail.com" ,"9145361045"));

    }

    public List<User> fetchAll() {
        return UserList;
    }

    public List<User> getUsersFromDatabase() {
        return UserList;
    }

    public boolean save(User user) {
        UserList.add(user);
        return true;
    }

    public boolean update(String userId, String userName) {
        boolean updateStatus = false;
        for (User user : UserList) {
            if (user.getUserId().equals(userId)){

                remove(user);

                user.setUserName(userName);

                save(user);

                return true;
            }
        }
        return false;
    }

    public boolean remove(User user) {
        UserList.remove(user);
        return true;
    }

}
