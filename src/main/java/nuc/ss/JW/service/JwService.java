package nuc.ss.JW.service;

import java.util.List;

import nuc.ss.JW.entity.JwBook;

public interface JwService {
	public JwBook getJwBook(Integer id);
	public List<JwBook> getAllJwBook();
}
