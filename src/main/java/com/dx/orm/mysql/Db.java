package com.dx.orm.mysql;

import com.dx.orm.idao.IDao;

import java.util.List;

/**
 * Created by diaomingkai on 2016-2-3.
 */
public class Db implements IDao {

    public <T> int insert(T entity) {
        return 0;
    }

    public <T> int update(T entity) {
        return 0;
    }

    public <T> T one(T entity) {
        return null;
    }

    public <T> List<T> list(T entity) {
        return null;
    }

    public int delete(String id) {
        return 0;
    }
}
