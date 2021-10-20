package com.example.PatchRequest.Controller;

import org.apache.johnzon.core.JsonMergePatchImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PatchRequest.Service.SchoolService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SchoolController {
	@Autowired private SchoolService schoolService;
	
	@ApiOperation(value = "Patch School",
           notes = "Patch School"
    )
	@PatchMapping(path = "/school/{schoolId}", consumes = "application/merge-patch+json")
	public ResponseEntity<Void> patchSchool(
			 @PathVariable Long schoolId,
		     @RequestBody JsonMergePatchImpl patchRequest) {
		return schoolService.patchSchool(schoolId, patchRequest);
	}
}