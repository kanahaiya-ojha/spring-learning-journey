package com.kanahaiya.mandi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MandiRepository extends JpaRepository<MandiPrice, Long> {
	// JpaRepository gives us save(), findAll(), findById(), etc. for free!
}
