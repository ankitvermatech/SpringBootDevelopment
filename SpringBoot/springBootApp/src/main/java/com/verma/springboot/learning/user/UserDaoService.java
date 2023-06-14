package com.verma.springboot.learning.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

       private static List<User> users = new ArrayList<>();

       private static int usersCount = 0;
       static{
              users.add(new User(++usersCount,"Ankit",LocalDate.now().minusYears(26)));
              users.add(new User(++usersCount,"Ankur",LocalDate.now().minusYears(23)));
              users.add(new User(++usersCount,"Abhishek",LocalDate.now().minusYears(17)));
       }

       public List<User> findAll(){
              return users;
       }

       public User findOne(int id){
              Predicate<User> findUser = user -> user.getId().equals(id);
              return users.stream().filter(findUser).findFirst().orElse(null);
       }

       public User saveUser(User user){
              user.setId(++usersCount);
              users.add(user);
              return user;
       }
}
