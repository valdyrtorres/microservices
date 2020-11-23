package com.valdirtorres.crud.exception;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valdirtorres.crud.data.vo.ProdutoVO;

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
public class ExceptionResponse implements Serializable {
	
	private static final long serialVersionUID = -2435017932476157922L;
	
	private Date timestamp;
	private String message;
	private String details;

}
