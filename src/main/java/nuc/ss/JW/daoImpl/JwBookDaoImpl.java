package nuc.ss.JW.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nuc.ss.JW.dao.JwBookDao;
import nuc.ss.JW.entity.JwBook;
@Repository
public class JwBookDaoImpl implements JwBookDao {
	private List<JwBook> books= new ArrayList<JwBook>();
	
	public JwBookDaoImpl() {
		books.add((new JwBook(1,"基督山伯爵",35)));
		books.add((new JwBook(2,"钢铁是怎样炼成的",20)));
		books.add((new JwBook(3,"飘",30)));
		books.add((new JwBook(4,"白夜行",20)));
		books.add((new JwBook(5,"编舟记",33)));
	}
	
	@Override
	public JwBook getJwBook(Integer id) {
		
		for(JwBook jwBook:books) {
			if(jwBook.getJw_id()==id) {
				return jwBook;
			}
		}	
		return null;
	}
	@Override
	public List<JwBook> getAllJwBook() {	
		return books;
	}

}
