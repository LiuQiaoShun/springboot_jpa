package online.qsx.dao;


import online.qsx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByName (String name);

    User findByNameAndAge (String name,Integer age);

    @Query("from user u where u.name=:name")
    User findUser(@Param("name") String name);
}
