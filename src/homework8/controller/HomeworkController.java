package homework8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import homework8.dao.NewsDao;
import homework8.entity.News;
import homework8.service.NewsService;
import homework8.service.Impl.NewsServiceImpl;

@Controller
public class HomeworkController {
	@Autowired
	private NewsService newsService;
	
	public void execute(News news){
		newsService.add(news);
	}

}
