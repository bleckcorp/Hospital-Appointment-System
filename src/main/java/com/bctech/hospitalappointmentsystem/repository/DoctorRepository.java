package com.bctech.hospitalappointmentsystem.repository;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,String>{
	//List<Doctor> findAll();
	//Optional<Doctor> findById(String Id);

	
}
