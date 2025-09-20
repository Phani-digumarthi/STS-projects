package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseStudentController {
@Autowired
CseStudentRepo repo;
CseAddressRepo rep;
@PostMapping("/insert")
public String savedata(@RequestBody CseStudent data) {
	repo.save(data);
	return"success";
}
}