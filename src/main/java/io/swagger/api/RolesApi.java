package io.swagger.api;

import io.swagger.model.Roles;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T15:59:49.250Z")

@Api(value = "roles", description = "the roles API")
public interface RolesApi {

    @ApiOperation(value = "", notes = "Get all roles", response = Roles.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Roles.class) })
    @RequestMapping(value = "/roles",
        method = RequestMethod.GET)
    ResponseEntity<Roles> rolesGet();

}
