package com.softtek.lambdas23052023.repository;

import java.util.List;

public abstract class CrudImpl<T,ID>{
    protected abstract IGenericRepo<T, ID> getRepo();

    public List<T> listAll(){
        return getRepo().findAll();
    };
}
