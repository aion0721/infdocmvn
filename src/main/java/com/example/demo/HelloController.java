package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Message;

@Controller
public class HelloController {

	@RequestMapping(value="/index")
	public String index(Model model) {
		return "index";
	}
	@RequestMapping(value="/input")
	public String input(Model model){
                // ��̃t�H�[���I�u�W�F�N�g��Model�ɐݒ�
		model.addAttribute("message", new Message());
                // �J�ڐ��Ԃ�(���̏ꍇ��input.html���J�ڐ�ƂȂ�)
		return "input";
	}
	
	@RequestMapping(value="/confirm", method = RequestMethod.POST)
	public String confirm(@ModelAttribute("message") Message form) {
                // �J�ڐ��Ԃ�(���̏ꍇ��confirm.html���J�ڐ�ƂȂ�)
		return "confirm";
	}
	@GetMapping("/sample")
	public String sample(Model model) {
		List<Message> list = new ArrayList<Message>();
		for(int i=0; i < 3; i++) {
			Message w = new Message();
			w.setText("aaa");
			list.add(w);
		}
		model.addAttribute("list",list);
		model.addAttribute("message", new Message());
		return "sample";
							
	}
	
	@RequestMapping(value="/result", method = RequestMethod.POST)
	public String result(@ModelAttribute("message") Message form, Model model){
		model.addAttribute("message", form);
		return "result";
	}
	
}
