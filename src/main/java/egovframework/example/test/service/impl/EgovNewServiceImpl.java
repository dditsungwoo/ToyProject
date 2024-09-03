package egovframework.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.service.EgovNewService;




@Service
public class EgovNewServiceImpl implements EgovNewService {

	@Autowired

	
	@Override
	public int selectDual() {
		return 0;
	}

	
}
