package homework8.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import homework8.controller.HomeworkController;
import homework8.entity.News;
import homework8.service.NewsService;

public class Springtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HomeworkController newsService = (HomeworkController) ctx.getBean("homeworkController");
		News  news  = new News(22, "111","222","333",new Date());
		newsService.execute(news);
	}

}
