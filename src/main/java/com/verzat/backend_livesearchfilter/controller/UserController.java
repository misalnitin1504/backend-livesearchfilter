package com.verzat.backend_livesearchfilter.controller;

import com.verzat.backend_livesearchfilter.model.User;
import com.verzat.backend_livesearchfilter.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/users")
//@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@CrossOrigin(origins = "https://frontend-live-search-app.netlify.app/", allowCredentials = "true")
//@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 🔍 Search
    @GetMapping("/search")
    public List<User> search(@RequestParam String keyword) {
        return userService.searchUsers(keyword);
    }

    // 📄 Pagination (3 per page default)
    @GetMapping("/search-paginated")
    public Map<String, Object> searchPaginated(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size) {

        return userService.searchUsersWithPagination(keyword, page, size);
    }
}