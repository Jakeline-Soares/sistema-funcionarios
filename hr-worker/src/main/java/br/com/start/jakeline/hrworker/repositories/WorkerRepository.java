package br.com.start.jakeline.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.start.jakeline.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	

}
