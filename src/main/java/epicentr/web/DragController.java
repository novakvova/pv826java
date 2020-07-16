package epicentr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletContext;

@Controller
public class DragController {
    @Autowired
    ServletContext context;

    @GetMapping("/drag")
    public String document()
    {
        return "drags";
    }


}
