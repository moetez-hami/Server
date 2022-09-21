package io.Server.Service;


import java.util.Collection;

import io.Server.Model.Server;

public interface ServerService {

	Server create(Server server);
	Server ping(String ipAddress);
	Collection<Server> list(int limit);
	Server getServer(Long id);
	Server update(Server server);
	Boolean delete(Long id); 
}
