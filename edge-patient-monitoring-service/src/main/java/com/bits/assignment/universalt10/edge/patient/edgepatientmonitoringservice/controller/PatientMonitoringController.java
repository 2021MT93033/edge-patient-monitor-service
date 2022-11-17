/**
 * 
 */
package com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.PatientData;
import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.SimpleMessage;
import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.service.PatientMonitoringService;

/**
 * @author Vicky
 *
 */
@RestController
public class PatientMonitoringController {

	@Autowired
	private PatientMonitoringService service;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/health")
	public ResponseEntity<SimpleMessage> healthCheck() {
		return ResponseEntity.ok(new SimpleMessage("The Service is Running successfully"));
	}

	@PostMapping("/monitor")
	public ResponseEntity<SimpleMessage> monitorPatientData(@RequestBody PatientData patientData) {
		SimpleMessage message = service.monitorPatientData(patientData);
		message.setMessage("Sent Successfully");
		return ResponseEntity.ok(message);
	}

}
