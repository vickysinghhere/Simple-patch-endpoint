package com.example.PatchRequest.Service;

import javax.json.JsonMergePatch;

import org.springframework.http.ResponseEntity;

public interface ISchoolService {
	ResponseEntity<Void> patchSchool(Long schoolId, JsonMergePatch patchRequest);
}
