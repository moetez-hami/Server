package io.Server.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.Server.Model.Server;

public interface ServerRepo extends JpaRepository<Server, Long>{
	Server findByIpAddress(String ipAddress);

}
