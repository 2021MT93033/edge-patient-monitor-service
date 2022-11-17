/**
 * 
 */
package com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.PatientData;
import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.SimpleMessage;
import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.service.PatientMonitoringService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author Vicky
 *
 */
@RestController
public class PatientMonitoringController {

	@Autowired
	private PatientMonitoringService service;

	@PostMapping("/monitor")
	public ResponseEntity<SimpleMessage> monitorPatientData(@RequestBody PatientData patientData) {
		SimpleMessage message = service.monitorPatientData(patientData);
		return ResponseEntity.ok(message);
	}

}
