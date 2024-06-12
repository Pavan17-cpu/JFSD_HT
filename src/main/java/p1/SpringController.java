package p1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
	 @Autowired
	  SpringDAO dao;

	  @GetMapping("/trigger")
	  @ResponseBody
	public String fun1()
	{
	  return "Welcome";
	}
	@GetMapping("/show")
	public String fun2(Model m)
	{
	  List<Reunion> sl1 = dao.findall();
	  m.addAttribute("list",sl1);
	  return "show";
	}
	@GetMapping("/add")
	public   String fun3(Model m)
	{
	  m.addAttribute("command",new Reunion());  
	  return "add";
	}
	@PostMapping("/add")
	public String fun4(@ModelAttribute("r") Reunion r)
	{
	  rl.add(r);
	  dao.insert(r);
	  return "redirect:/show";
	}
	@GetMapping("/update/{id}")
	public String fun5(@PathVariable("id") int id,Model m) {
	  Reunion r=dao.find(id);
	  m.addAttribute("command", r);
	  return "update";
	}

	@PostMapping("/update")
	public String fun6(@ModelAttribute("r") Reunion  r) {
	  dao.update(r);
	  return "redirect:/show";
	}

	@GetMapping("/delete/{id}")
	public String fun7(@PathVariable("id") int id)
	{
	  dao.delete(id);
	  return "redirect:/show";
	}

	static List<Reunion>rl;
	static {
		   rl=new ArrayList<Reunion>();
		  } 
}
