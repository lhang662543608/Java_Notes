package sylu.elastic;

import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sylu.elastic.been.Article;
import sylu.elastic.been.Book;
import sylu.elastic.repository.BookRepository;

import java.io.IOException;

@SpringBootTest
class Springboot09ElasticApplicationTests {

	@Autowired
	JestClient jestClient;

	@Autowired
	BookRepository bookRepository;

	@Test
	public void test02(){
//		Book book = new Book();
//		book.setId(1);
//		book.setBookName("西游记");
//		book.setAuthor("吴承恩");
//		bookRepository.index(book);


		for (Book book : bookRepository.findByBookNameLike("游")) {
			System.out.println(book);
		}


	}
	@Test
	void contextLoads() {
		//1.给ES中索引一个文档
		Article article = new Article();
		article.setId(1);
		article.setAuthor("猪八戒");
		article.setTitle("娶媳妇");
		article.setContent("高老庄娶媳妇！");

		//构建一个索引功能
		Index index = new Index.Builder(article).index("sylu").type("msg").build();

		try {
			//执行
			jestClient.execute(index);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//测试搜索
	@Test
	public void search(){

		//查询表达式
		String json ="{\n" +
				"    \"query\" : {\n" +
				"        \"match\" : {\n" +
				"            \"content\" : \"网络\"\n" +
				"        }\n" +
				"    }\n" +
				"}";

		//更多操作：https://github.com/searchbox-io/Jest/tree/master/jest
		//构建搜索功能
		Search search = new Search.Builder(json).addIndex("sylu").addType("paper").build();

		//执行
		try {
			SearchResult result = jestClient.execute(search);
			System.out.println(result.getJsonString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
