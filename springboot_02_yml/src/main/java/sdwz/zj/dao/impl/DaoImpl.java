package sdwz.zj.dao.impl;

import org.springframework.stereotype.Repository;
import sdwz.zj.dao.Dao;

@Repository
public class DaoImpl implements Dao {
    @Override
    public void findAll() {
        System.out.println("DaoImpl.findAll running...");
    }
}
