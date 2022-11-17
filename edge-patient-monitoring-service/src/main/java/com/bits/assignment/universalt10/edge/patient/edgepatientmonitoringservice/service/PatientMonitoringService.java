/**
 * 
 */
package com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.service;

import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.PatientData;
import com.bits.assignment.universalt10.edge.patient.edgepatientmonitoringservice.model.SimpleMessage;

/**
 * @author Vicky
 *
 */
public interface PatientMonitoringService {

	SimpleMessage monitorPatientData(PatientData patientData);

}
