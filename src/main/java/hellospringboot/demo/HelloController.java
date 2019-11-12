package hellospringboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * 测试控制器
 *
 * @author haowenchao
 * @since 2019-11-06 16:20
 */

//@RestController
@Controller
public class HelloController {

    /*
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Autowired
    private StudentProperties studentProperties;
    */

    @RequestMapping("/hello")
    public String hello(Model m){
//        return studentProperties.getName() + ", age: deployed " + studentProperties.getAge();
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }

}
