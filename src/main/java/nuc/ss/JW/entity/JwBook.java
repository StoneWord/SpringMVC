package nuc.ss.JW.entity;

public class JwBook {
	private Integer jw_id;
	private String jw_title;
	private Integer  jw_price;
	
	public Integer getJw_id() {
		return jw_id;
	}
	public void setJw_id(Integer jw_id) {
		this.jw_id = jw_id;
	}
	public String getJw_title() {
		return jw_title;
	}
	public void setJw_title(String jw_title) {
		this.jw_title = jw_title;
	}
	public Integer getPrice() {
		return jw_price;
	}
	public void setPrice(Integer price) {
		this.jw_price = price;
	}
	
	public JwBook(Integer jw_id, String jw_title, Integer price) {
		super();
		this.jw_id = jw_id;
		this.jw_title = jw_title;
		this.jw_price = price;
	}
	
	public JwBook() {	
	}
	@Override
	public String toString() {
		return "[书籍编号：" + jw_id + ",书籍名：" + jw_title + ", 价格：" + jw_price + "]";
	}
	
}
