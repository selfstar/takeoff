package wid.de.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiKeyAuthDefinition;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wid.de.exception.ErrorResponse;
import wid.de.exception.PersonnelResponse;

@RestController
@Api(value = "Contract structure case in iMX")
@RequestMapping("/contracts")
@ApiResponses(value = {
    @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
    @ApiResponse(code = 404, message = "Not Found", response = PersonnelResponse.class),
    @ApiResponse(code = 500, message = "Internal Server Error")
})
@ApiKeyAuthDefinition(name = "iMX-Session-Key", description = "iMX Session Key", key = "iMX-Session-Key", in = ApiKeyAuthDefinition.ApiKeyLocation.HEADER)
public class PersonnelController
{



  //test test another comment 
}
