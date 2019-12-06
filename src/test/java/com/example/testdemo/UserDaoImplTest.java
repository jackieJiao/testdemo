package com.example.testdemo;

import com.example.testdemo.controller.User;
import com.example.testdemo.controller.UserDao;
import com.example.testdemo.controller.UserServiceImpl;
import org.easymock.EasyMock;
import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class UserDaoImplTest {

    @Test
    public void test(){

        User exp=new User(1001);

        /* 创建mock对象*/
        UserDao mock = EasyMock.createMock(UserDao.class);

        /* 录制mock对象预期行为 */
        EasyMock.expect(mock.getById(1001)).andReturn(new User(1001));

        /* 重放mock对象，*/

        EasyMock.replay(mock);


        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(mock);
        User us = userService.query(1001);
        assertEquals("assertFail",exp,us);
        EasyMock.verify(mock);




    }
}
