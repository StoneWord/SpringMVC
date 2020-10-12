package nuc.ss.JW.dao;

import java.util.List;

import nuc.ss.JW.entity.JwBook;

public interface JwBookDao {
	public JwBook getJwBook(Integer id);

	public List<JwBook> getAllJwBook();
}
