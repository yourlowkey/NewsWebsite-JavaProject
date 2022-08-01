package news.kits.model;

import java.util.Date;

public class News {
	private int newsID;
	private String newsName;
	private String newsTitle;
	private String newsContent;
	private String author;
	private String imgURL;
	private Date date;
	public News(int newsID, String newsName, String newsTitle, String newsContent, String author, String imgURL,
			Date date) {
		super();
		this.newsID = newsID;
		this.newsName = newsName;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.author = author;
		this.imgURL = imgURL;
		this.date = date;
	}
	public int getNewsID() {
		return newsID;
	}
	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "News [newsID=" + newsID + ", newsName=" + newsName + ", newsTitle=" + newsTitle + ", newsContent="
				+ newsContent + ", author=" + author + ", imgURL=" + imgURL + ", date=" + date + "]";
	}
	public News() {
		super();
	}
	
}
