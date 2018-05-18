package homework8.service.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import homework8.dao.NewsDao;
import homework8.entity.News;
import homework8.service.NewsService;

public class NewsServiceImpl implements NewsService {

	private NewsDao newsDao;
	
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	
	public void add(News news) {
		newsDao.add(news);
	}

}
