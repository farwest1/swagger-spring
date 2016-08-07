package io.swagger.api.Permission;

import io.swagger.api.Permission.PermissionsApi;
import io.swagger.model.Permissions;
import io.swagger.model.Permission;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T15:59:49.250Z")

@Controller
public class PermissionsApiController implements PermissionsApi {

    public ResponseEntity<Permissions> permissionsGet() {
        Permissions permissions = new Permissions();
        permissions.add(new Permission().name("Willi").id("1"));
        permissions.add(new Permission().name("Schorch").id("2"));
        // do some magic!
        return new ResponseEntity<Permissions>(permissions,HttpStatus.OK);
    }

    public ResponseEntity<Permission> permissionsPermissionIdGet(@ApiParam(value = "",required=true ) @PathVariable("permissionId") String permissionId) {
      if (!permissionId.equals("9999")){
        Permission permission = new Permission().id(permissionId).name("echo");
        return new ResponseEntity<Permission>(permission, HttpStatus.OK);
      }
      else {
        throw new PermissionNotFoundException(permissionId);
      }
    }

}
