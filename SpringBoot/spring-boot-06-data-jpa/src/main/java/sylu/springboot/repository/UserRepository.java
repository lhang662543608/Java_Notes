package sylu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sylu.springboot.entity.User;

/**
 * 继承jpa完成数据库的操作
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
