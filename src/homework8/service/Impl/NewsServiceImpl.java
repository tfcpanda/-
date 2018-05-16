package homework8.service.Impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import homework8.dao.NewsDao;
import homework8.entity.News;
import homework8.service.NewsService;

@Service("NewsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsDao;
	@Transactional
	public void add(News news) {
		newsDao.add(news);
	}


}
