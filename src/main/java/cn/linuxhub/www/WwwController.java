package cn.linuxhub.www;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// 创建一个名为 HelloController类

@RestController
public class WwwController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

        @RequestMapping("/index")
        public String index() {
                return "Hello Linuxhub!";
        }



}
