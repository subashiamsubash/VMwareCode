package com.vm.vmcode.controllor;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vm.vmcode.model.NumberModel;
import com.vm.vmcode.model.Status;
import com.vm.vmcode.services.NumberServices;

@RestController
public class NumberControllor {

	@Autowired
	private NumberServices scv;

	@RequestMapping(value = "/api/generate", method = RequestMethod.POST)
	public ResponseEntity<?> genrateNo(@RequestBody NumberModel payload) {

		UUID uuid = scv.writeObject(payload);
		return ResponseEntity.status(202).body("task:" + uuid);
	}

	@RequestMapping(value = "/api/tasks/{id}/status", method = RequestMethod.GET)
	public ResponseEntity<?> getStatus(@PathVariable("id") UUID id) {
		if (scv.getStatus(id)) {
			return ResponseEntity.status(200).body("result:" + Status.SUCCESS);
		} else
			return ResponseEntity.status(300).body("result:" + Status.ERROR);

	}

	@RequestMapping(value = "/api/tasks/{id}/getlist", method = RequestMethod.GET)
	public ResponseEntity<?> getList(@PathVariable("id") UUID id) {
		ArrayList<Integer> li = scv.get_number(id);
		return ResponseEntity.status(200).body("result:" + li);
	}

}
