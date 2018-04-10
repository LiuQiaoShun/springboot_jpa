package online.qsx;

import online.qsx.dao.UserRepository;
import online.qsx.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDataJpaApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		User jack=userRepository.save(new User("jack",18));
		User luck=userRepository.save(new User("luck",18));
		User 张三=userRepository.save(new User("张三",18));
		System.out.println(jack);
		System.out.println(luck);
		System.out.println(张三);
		System.out.println(userRepository.findByName("jack"));
		System.out.println(userRepository.findByNameAndAge("luck",18));
		System.out.println(userRepository.findUser("张三"));
	}

}
