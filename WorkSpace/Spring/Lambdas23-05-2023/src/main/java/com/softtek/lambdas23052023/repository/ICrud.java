package com.softtek.lambdas23052023.repository;

import java.util.List;

public interface ICrud<T,ID> {
    List<T> listAll();
}
