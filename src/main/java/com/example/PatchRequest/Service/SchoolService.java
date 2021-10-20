package com.example.PatchRequest.Service;

import javax.json.JsonMergePatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.PatchRequest.PatchHelper.PatchHelper;
import com.example.PatchRequest.Pojo.School;

@Component
public class SchoolService implements ISchoolService {

	@Autowired private PatchHelper patchHelper;
	
	@Override
	public ResponseEntity<Void> patchSchool(Long schoolId, JsonMergePatch patchRequest) {
		try {
			//get the initail school value, in this example we have manually initialised it
			School initialschool = new School(true, true, 12, 4, false);
			School patchedSchool = patchHelper.mergePatch(patchRequest, initialschool,
					School.class);
			System.out.print(patchedSchool.getDoors());
			//update the patchedSchool
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
