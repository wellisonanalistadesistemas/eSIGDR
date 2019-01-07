package com.daoapi;

import java.util.List;
import java.util.Map;

import com.entities.Usuario;

public interface UsersDao {

	public List<Usuario> list(Map<String, String> objPesquisa);

	Usuario getObj(Integer id);

	boolean deletar(Integer id);

	void merge(Usuario users);

	void persist(Usuario users);
}