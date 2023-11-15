package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        // model.addAttribute("title", "Blog")
        // ではなく
        // model["title"] = "Blog" を記述できるように、
        // org.springframework.ui.set 拡張機能をインポートします
        // https://docs.spring.io/spring-framework/docs/current/kdoc-api/
        // https://docs.spring.io/spring-framework/docs/current/kdoc-api/spring-context/org.springframework.ui/set.html
        model["title"] = "Blog"
        return "blog"
    }

}