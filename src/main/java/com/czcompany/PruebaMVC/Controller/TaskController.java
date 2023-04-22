package com.czcompany.PruebaMVC.Controller;

import com.czcompany.PruebaMVC.Model.Task;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) { //Objeto model permitirá observar datos
        model.addAttribute("tasks", tasks); //se añade a el modelo una tarea con descripcion
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam String description) {//añado peticion
        tasks.add(new Task(description)); //añado tarea con nueva descripcion
        return "redirect:/"; //redirijo al usuario para que pueda ver actaualizacion de model
    }

    @PostMapping("/deleteTask")
    public String deleteTask(@RequestParam int index) {
        tasks.remove(index);
        return "redirect:/";
    }

}
