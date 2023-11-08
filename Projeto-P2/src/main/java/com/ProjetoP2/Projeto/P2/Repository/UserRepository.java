package com.ProjetoP2.Projeto.P2.Repository;

import com.ProjetoP2.Projeto.P2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
