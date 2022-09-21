package io.Server.Service;

import static org.assertj.core.api.Assertions.offset;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import io.Server.Repo.ServerRepo;
import io.Server.Enumeration.Status;
import io.Server.Model.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService{

	private final ServerRepo serverRepo;
	
	public Server create(Server server) {
		log.info("Saving new server: {}",server.getName());
		server.setImageUrl(setServerImageUrl());
		// TODO Auto-generated method stub
		return serverRepo.save(server);
	}

	

	public Server ping(String ipAddress){
		log.info("pinging server IP: {}",ipAddress);
		Server server =serverRepo.findByIpAddress(ipAddress);
		InetAddress address;
		try {
			address = InetAddress.getByName(ipAddress);
			server.setStatus(address.isReachable(10000) ?  Status.SERVER_UP :Status.SERVER_DOWN );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub
		serverRepo.save(server);
		return server;
	}

	public Collection<Server> list(int limit) {
		log.info("Fetching All servers");
		// TODO Auto-generated method stub
		return serverRepo.findAll(PageRequest.of(0, limit)).toList();
	}

	public Server getServer(Long id) {
		log.info("fetching Server by ID: {}",id);
		// TODO Auto-generated method stub
		return serverRepo.findById(id).get();
	}

	public Server update(Server server) {
		log.info("Update existing server: {}",server.getName());
		// TODO Auto-generated method stub
		return serverRepo.save(server);
	}

	public Boolean delete(Long id) {
		log.info("Deleting server: {}",id);
		// TODO Auto-generated method stub
		serverRepo.deleteById(id);
		return true;
	}

	private String setServerImageUrl() {
		// TODO Auto-generated method stub
		return null;
	}
}
