package com.lamichhane.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
	
	private String message;
	private long timeStamp;
	private String statusCode;
	
	
}
