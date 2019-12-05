package com.pccube.espd.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Status {

	ACTIVE("ACTIVE"),
	DEPRECATED("DEPRECATED");
	

	public static final List<Status> STATUSES = Collections.unmodifiableList(Arrays.asList(values()));
	
	private final String code;

	Status(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
    public static Status getByStatusCode(final String code) {
        for (Status status : STATUSES) {
            if (status.getCode().equalsIgnoreCase(code)) {
                return status;
            }
        }
        return DEPRECATED;
    }
}
