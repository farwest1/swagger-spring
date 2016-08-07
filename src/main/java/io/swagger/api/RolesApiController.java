package io.swagger.api;

import io.swagger.model.Roles;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T15:59:49.250Z")

@Controller
public class RolesApiController implements RolesApi {

    public ResponseEntity<Roles> rolesGet() {
        // do some magic!
        return new ResponseEntity<Roles>(HttpStatus.OK);
    }

}
