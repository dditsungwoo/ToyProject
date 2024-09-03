package egovframework.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;


@Repository
public class NewDAO {

	@Autowired
	EgovNewService egovNewService;
	
	
}
