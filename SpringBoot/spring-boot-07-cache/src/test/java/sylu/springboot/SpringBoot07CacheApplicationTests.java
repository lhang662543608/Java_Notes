package sylu.springboot;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import sylu.springboot.bean.Employee;
import sylu.springboot.mapper.EmployeeMapper;

@SpringBootTest
class SpringBoot07CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate; //操作k-v字符串

    @Autowired
    RedisTemplate redisTemplate;        //k-v都是对象

    @Autowired
    RedisTemplate<Object,Employee> empRedisTemplate;

    /**
     * Redis常见的五大数据类型
     * String（字符串）、List（列表）、Set（集合）、Hash（散列）、Zset（有序组合）
     * stringRedisTemplate.opsForValue()[String（字符串）]
     * stringRedisTemplate.opsForList()[List（列表）]
     * stringRedisTemplate.opsForSet()[Set（集合）]
     * stringRedisTemplate.opsForHash()[Hash（散列）]
     * stringRedisTemplate.opsForZset()[Zset（有序组合）]
     */
    @Test
    public void test01(){
//        stringRedisTemplate.opsForValue().append("msg", "haha");
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);

        stringRedisTemplate.opsForList().leftPush("mylist", "1");
        stringRedisTemplate.opsForList().leftPush("mylist", "2");
    }

    /**
     * 测试保存对象
     */
    @Test
    public void test02(){
        Employee empById = employeeMapper.getEmpById(1);
        //默认保存对象使用jdk序列化机制，序列化后 的数据保存到redis中
//        redisTemplate.opsForValue().set("emp-01",empById);
        //1.将数据以json的方式保存
//            1)自己将对象转化为json
//           2)redisTemplate默认的序列化机制::改变默认的序列化规则
        empRedisTemplate.opsForValue().set("emp-01",empById);
    }

    @Test
    void contextLoads() {
        Employee employee = employeeMapper.getEmpById(1);
        System.out.println(employee);
    }

}
