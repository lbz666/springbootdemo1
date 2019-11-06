package com.offcn.springbootdemo1;

import com.offcn.springbootdemo1.com.offcn.mapper.UserMapper;
import com.offcn.springbootdemo1.com.offcn.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springbootdemo1Application.class)
public class SbootTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void getUserList(){
        List<MUser> userList = userMapper.getUserList();
        for (MUser user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void testRedisTemplate(){
        // 存d到redis数据库
        redisTemplate.opsForValue().set("hello","0708java");
        // 取
        String str =(String) redisTemplate.opsForValue().get("hello");
        System.out.println(str);

        MUser user = new MUser();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("123");
        user.setName("超人");
        redisTemplate.opsForValue().set("user",user);
        MUser user1 = (MUser)redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }


}
