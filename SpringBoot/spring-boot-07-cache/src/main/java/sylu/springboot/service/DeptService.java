package sylu.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import sylu.springboot.bean.Department;
import sylu.springboot.mapper.DepartmentMapper;

@CacheConfig(cacheNames = "dept",cacheManager = "cacheManager")
@Service
public class DeptService {

    @Autowired
    DepartmentMapper departmentMapper;
    /**
     * 缓存的数据能存入redis；
     * 第二次从缓存中查询就不能反序列化回来；
     * 存的是dept的json数据;CacheManager默认使用RedisTemplate<Object, Employee>操作Redis
     *
     * @param id
     * @return
     */

    @Cacheable()
    public Department getDeptById(Integer id){
        System.out.println("查询部门"+id);
        Department department = departmentMapper.getDeptById(id);
        return department;
    }




}
