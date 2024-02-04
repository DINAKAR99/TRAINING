package mvc.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.models.User;

@Repository
public class UserdaoImpl implements UserDao {
    @Autowired
    private SessionFactory s1;

    public UserdaoImpl(SessionFactory s1) {
        this.s1 = s1;
    }

    @Override
    public void saveUsertoDB(User u1) {
        System.out.println("This is the implementation of saving user to DB");
        s1.getCurrentSession().persist(u1);

    }

}
