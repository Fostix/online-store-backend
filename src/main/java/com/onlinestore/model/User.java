package com.onlinestore.model;

import java.util.UUID;

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
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO.UUID)
	private UUID id;
	@NonNull
	private String name;
	@NonNull
	private String surname;
	@NonNull
	private String email;
	
}
