package com.learn1.swager.controller;

import com.learn1.swager.dto.ErrorMessageDto;
import com.learn1.swager.dto.MessageDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Test Swagger", description = "Test swagger summery")
@RestController
public class SwaggerTest {

  @Operation(
      description = "Sample get endpoint",
      summary = "Test end point summery"
  )
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "success request", content = {
          @Content(schema = @Schema(implementation = ErrorMessageDto.class), examples = @ExampleObject())}),
      @ApiResponse(responseCode = "400", description = "bad request", content = {
          @Content(schema = @Schema(implementation = MessageDto.class), examples = @ExampleObject())})
  })
  @GetMapping("/test/{name}")
  public String index(@PathVariable("name") String name) {
    return "System works fine!" + name;
  }
}
