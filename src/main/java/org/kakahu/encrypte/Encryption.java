package org.kakahu.encrypte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Encryption {

    @GetMapping(value = "/test")
    @ResponseBody//只返回字符串，而不是视图
    public String getUrl()  {
        return "TEST";
    }

}
