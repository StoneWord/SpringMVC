package nuc.ss.JW.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


import nuc.ss.JW.entity.JwBook;
import nuc.ss.JW.service.JwService;

@Controller
@RequestMapping("/book")
public class JwBookController {
	@Autowired
	private JwService js;
	
	@RequestMapping("/detailsForJson")
    public ModelAndView detailsForJson(Integer id) {
		JwBook book=js.getJwBook(id);
    	ModelAndView mv=new ModelAndView();
        MappingJackson2JsonView jsonView=new MappingJackson2JsonView();
        mv.setView(jsonView);
        mv.addObject("book",book);
    	return mv;
    }
	
	@RequestMapping("/getJwBookById")
    public ModelAndView details(Integer id) {
    	JwBook book=js.getJwBook(id);
    	ModelAndView mv=new ModelAndView();
        mv.setViewName("book/getJwBookById");
        mv.addObject("book",book);
    	return mv;
    }
	
	
	@RequestMapping("/showall")
	public ModelAndView showAllJwBook() {	
		List<JwBook> books = js.getAllJwBook();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("book/showAll");
		mv.addObject("books",books);
		return mv;
	}
	
	
	@RequestMapping(value="/showAll" ,method =RequestMethod.POST)
	@ResponseBody
	public ModelAndView getAddBook(HttpServletRequest request) {
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String bookname = request.getParameter("bookname");
		int bookprice = Integer.parseInt(request.getParameter("bookprice"));
		JwBook book = new JwBook(bookid,bookname,bookprice);
		List<JwBook> books = js.getAllJwBook();
		books.add(book);
		
		System.out.println(book.toString());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("book/showAll");
		mv.addObject("books",books);
		return mv;
	}
}
