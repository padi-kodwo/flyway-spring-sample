package com.padi.flyway.controller;



import com.padi.flyway.domain.User;
import com.padi.flyway.dto.UserDto;
import com.padi.flyway.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {

  private final UserService userService;
  private final ModelMapper modelMapper;

  public UserController(UserService userService, ModelMapper modelMapper) {
    this.userService = userService;
    this.modelMapper = modelMapper;
  }


  @GetMapping("{id}")
  public UserDto get(@PathVariable String id){

    User user = userService.findById(id);

    return modelMapper.map(user, UserDto.class);
  }
}
