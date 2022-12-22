package com.globalit.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    boolean existsByNickName(String nickname);

    boolean existsByEmail(String email);
}