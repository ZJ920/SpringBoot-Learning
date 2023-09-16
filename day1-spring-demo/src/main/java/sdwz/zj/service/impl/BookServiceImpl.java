package sdwz.zj.service.impl;

import sdwz.zj.dao.Dao;
import sdwz.zj.service.BookService;

public class BookServiceImpl implements BookService {

    private Dao dao;

    @Override
    public void save() {
        System.out.println("DaoImpl save....");
        System.out.print("(经过BookService):");
        dao.save();
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
