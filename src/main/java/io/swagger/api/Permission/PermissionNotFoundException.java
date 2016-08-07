package io.swagger.api.Permission;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Moeller.Bernd on 07.08.2016.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PermissionNotFoundException extends RuntimeException {

  public PermissionNotFoundException(String permissionId)  {
    super("could not find permission '" + permissionId + "'.");
  }

}
