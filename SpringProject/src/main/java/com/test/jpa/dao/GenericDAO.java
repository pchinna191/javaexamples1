package com.test.jpa.dao;

import java.io.Serializable;

public interface GenericDAO<T , PK extends Serializable> {
	
		T create(T newInstance);
		T read(PK id);
		T makePersistent(T transientObject);
	}

