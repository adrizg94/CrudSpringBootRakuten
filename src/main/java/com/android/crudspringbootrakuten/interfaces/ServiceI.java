package com.android.crudspringbootrakuten.interfaces;

import java.util.List;

public interface ServiceI<Bean, I> {

    public List<Bean> getAll();
    public Bean getId(I id);
    public void add(Bean bean);
    public void delete(I id);
}
