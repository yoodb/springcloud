package com.yoodb.study.nacos.demo01;

        import com.google.gson.Gson;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/provider/{id}")
    public String provider(@PathVariable("id")Integer id) {
        BootUser user = new BootUser();
        user.setId(id);
        user.setName("关注微信公众号“Java精选”，Spring Cloud系列文章持续更新中" +
                "，带你从入门到精通，玩转Spring Cloud框架。");
        String jsons = new Gson().toJson(user);
        return jsons;
    }
}