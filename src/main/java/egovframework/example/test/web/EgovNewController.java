package egovframework.example.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.test.service.EgovNewService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class EgovNewController {

	@Autowired
	EgovNewService egovNewService;
	
	@RequestMapping("/newList.do")
	public String newList() {
		
		int dual= egovNewService.selectDual();
		log.info("EgovNewController"+dual );
		return "sample/egovNewList";
	}
}
