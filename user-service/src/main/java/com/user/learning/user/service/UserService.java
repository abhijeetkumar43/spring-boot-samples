package com.user.learning.user.service;

import com.user.learning.user.entity.User;
import com.user.learning.user.repository.UserRepository;
import com.user.learning.user.vo.Department;
import com.user.learning.user.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
@Autowired
private RestTemplate restTemplate;
    public UserDepartmentVO getByUserId(Long id) {
        UserDepartmentVO userDepartmentVO= new UserDepartmentVO();
        User user=userRepository.getByUserId(id);
        userDepartmentVO.setUser(user);
        userDepartmentVO.setDepartment( restTemplate.getForObject
                ("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(), Department.class));
      return userDepartmentVO;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
