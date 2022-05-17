package com.example.schedule;

import model.Client;
import model.userFactory.BasicUser;
import model.userFactory.DataSource;
import model.userFactory.UserFactory;
import model.userFactory.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ScheduleApplicationTests {

    @Mock
    DataSource dataSource;

    @Test
    void factoryTestClient() {
        Client expectedResult = new Client("ana","mere");
        UserFactory userFactory = new UserFactory();
        BasicUser basicUser = userFactory.createUser(UserType.CLIENT,"ana","mere");
        Assertions.assertEquals(basicUser,expectedResult);
    }

    @Test
    public void dataSourceTest(){
        when(dataSource.maGandescLaUnNr()).thenReturn(5);
        Client client = new Client("ana","mere");
        client.setDataSource(dataSource);
        int value = client.getDataSource().maGandescLaUnNr();
        verify(dataSource,times(1)).maGandescLaUnNr();
    }

}
