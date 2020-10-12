package nuc.ss.JW.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nuc.ss.JW.dao.JwBookDao;
import nuc.ss.JW.entity.JwBook;
import nuc.ss.JW.service.JwService;
@Service
public class JwServiceImpl implements JwService {
	@Autowired
	private JwBookDao dao;
	@Override
	public JwBook getJwBook(Integer id) {
		// TODO Auto-generated method stub
		return dao.getJwBook(id);
	}
	@Override
	public List<JwBook> getAllJwBook() {
		// TODO Auto-generated method stub
		return dao.getAllJwBook();
	}

}
