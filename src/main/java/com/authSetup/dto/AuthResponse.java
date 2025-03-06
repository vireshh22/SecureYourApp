package com.authSetup.dto;

import lombok.Data;


@Data
public class AuthResponse {
	
	private String token;
    private String username;
	private String role;

    public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setRole(String role){
		this.role=role;
	}
	
	
	public String getRole(){
		return role;
	}
}
