package com.test.ondony.dao.impl;
 
import java.util.List;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.test.ondony.dao.UserDao;
import com.test.ondony.model.User;
 
@Repository("userDao")
public class UserDaoImpl implements UserDao{
     
    @Autowired
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
 
    @Override
    public List<User> getUserList() {
         
        return sqlSession.selectList("getUserList");
    }
 
}
