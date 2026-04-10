package com.verzat.backend_livesearchfilter.service;


import com.verzat.backend_livesearchfilter.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final List<User> users = List.of(
            new User(1L, "Nitin", "nitin@gmail.com", "Nitin@123"),
            new User(2L, "Amit", "amit@gmail.com", "Amit@123"),
            new User(3L, "Sneha", "sneha@gmail.com", "Sneha@123"),
            new User(4L, "Rahul", "rahul@gmail.com", "Rahul@123"),
            new User(5L, "Priya", "priya@gmail.com", "Priya@123"),
            new User(6L, "Ravi", "ravi@gmail.com", "Ravi@123"),
            new User(7L, "Anita", "anita@gmail.com", "Anita@123")
    );

    // 🔍 Case-Sensitive Search

    public List<User> searchUsers(String keyword) {

        return users.stream()
                .filter(user ->
                        user.getName().contains(keyword) ||
                                user.getEmail().contains(keyword) ||
                                String.valueOf(user.getId()).contains(keyword)
                )
                .collect(Collectors.toList());
    }

    // 📄 Pagination (default use 3 per page)

    public Map<String, Object> searchUsersWithPagination(String keyword, int page, int size) {

        List<User> filtered = searchUsers(keyword);

        int start = (page - 1) * size;
        int end = Math.min(start + size, filtered.size());

        List<User> paginated = (start < filtered.size())
                ? filtered.subList(start, end)
                : Collections.emptyList();

        Map<String, Object> response = new HashMap<>();
        response.put("data", paginated);
        response.put("currentPage", page);
        response.put("totalPages", (int) Math.ceil((double) filtered.size() / size));
        response.put("totalRecords", filtered.size());

        return response;
    }
}