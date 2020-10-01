package mvc.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import
org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.model.Tarefa;
import mvc.model.TarefasDAO;


@Controller
public class TarefasController {
    @RequestMapping("/")
    public String execute() {
        System.out.println("Lógica do MVC");
        return "info";
    }
    
    @RequestMapping("criaTarefa"
    		)
    		    public String form() {
    		        return "formTarefa";
    		}
    
    @RequestMapping("adicionaTarefa")
    public String adiciona(Tarefa
tarefa) {
     TarefasDAO dao = new
     TarefasDAO();
     dao.adicionaDescricao(tarefa);
        return "adicionada";
    }
    
    
    @RequestMapping("getTarefa")
    public ModelAndView get() {
     TarefasDAO dao = new
     TarefasDAO();
     List<mvc.model.Tarefa> tarefas = dao.getLista();
     ModelAndView model = new ModelAndView("lista");
		model.addObject("tarefas", tarefas);
        return model;
    }
    
    
    
}