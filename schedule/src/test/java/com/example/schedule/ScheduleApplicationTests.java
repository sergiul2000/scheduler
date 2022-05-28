package com.example.schedule;

import model.Client;
import model.User;
import model.UserFactory;
import model.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ScheduleApplicationTests {



    @Test
    void factoryTestClient() {
        Client expectedResult = new Client("ana1","mere1","ana","mere","ana@yahoo.com");
        UserFactory userFactory = new UserFactory();
        User basicUser = userFactory.createUser(UserType.CLIENT,"ana1","mere1","ana","mere","ana@yahoo.com");
        Assertions.assertEquals(basicUser,expectedResult);
    }


}
