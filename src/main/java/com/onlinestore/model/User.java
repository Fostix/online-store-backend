package com.onlinestore.model;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Builder
public class User {
//	@GeneratedValue(strategy=GenerationType.UUID)
//	@GeneratedValue(strategy=GenerationType.AUTO.UUID)
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
	@NonNull
	private String name;
	@NonNull
	private String surname;
	@NonNull
	private String email;
	
}
