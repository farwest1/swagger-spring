package io.swagger.api.Permission;

import io.swagger.model.Permissions;
import io.swagger.model.Permission;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-09T15:17:30.459Z")

@Api(value = "permissions", description = "the permissions API")
public interface PermissionsApi {

    @ApiOperation(value = "", notes = "Gets list of `Permission` objects. ", response = Permissions.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Permissions.class),
        @ApiResponse(code = 406, message = "No data found", response = Permissions.class) })
    @RequestMapping(value = "/permissions",
        produces = { "application/json", "text/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Permissions> permissionsGet();


    @ApiOperation(value = "", notes = "", response = Permission.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Permission.class) })
    @RequestMapping(value = "/permissions/{permissionId}",
        produces = { "application/json", "text/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Permission> permissionsPermissionIdGet(
@ApiParam(value = "",required=true ) @PathVariable("permissionId") String permissionId


);

}
