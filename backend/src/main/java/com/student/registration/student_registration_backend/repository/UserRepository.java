package com.student.registration.student_registration_backend.repository;

import com.student.registration.student_registration_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
