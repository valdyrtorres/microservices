package com.valdirtorres.auth.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import org.springframework.security.core.userdetails.UserDetails;

import com.valdirtorres.auth.entity.Permission;
import com.valdirtorres.auth.entity.User;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserVO implements Serializable {
	
	private static final long serialVersionUID = -8780934327409758259L;
	
	private String userName;
	private String password;

}
