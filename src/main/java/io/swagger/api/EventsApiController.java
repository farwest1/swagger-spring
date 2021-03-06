package io.swagger.api;


import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-09T15:17:30.459Z")

@Controller
public class EventsApiController implements EventsApi {
    private static Logger LOG = LoggerFactory.getLogger(EventsApiController.class);

    public ResponseEntity<Void> eventsPut(@RequestBody final String body) {
        LOG.info(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
