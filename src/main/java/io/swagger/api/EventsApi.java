package io.swagger.api;


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

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "", notes = "Used for push tests ", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful PUT request", response = Void.class) })
    @RequestMapping(value = "/events",
        consumes = { "application/json", "text/xml", "text/plain" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> eventsPut(@RequestBody final String body);

}
