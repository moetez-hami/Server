package io.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.Server.Enumeration.Status;
import io.Server.Model.Server;
import io.Server.Repo.ServerRepo;

@SpringBootApplication
public class ServerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
		
	}
	//ServerRepo serverRepo
//	CommandLineRunner run(ServerRepo serverRepo) {
//		return args ->{
//			serverRepo.save(new Server(null,"192.168.1.160","Ubuntu Linux","16 GB","Personal PC","http://localhost:8000/server/image/server1.png",Status.SERVER_UP));
//			serverRepo.save(new Server(null,"192.168.1.58","Fedora Linux","16 GB","Dell Tower","http://localhost:8000/server/image/server2.png",Status.SERVER_DOWN));
//			serverRepo.save(new Server(null,"192.168.1.21","MS 2008","32 GB","Web Server","http://localhost:8000/server/image/server3.png",Status.SERVER_UP));
//			serverRepo.save(new Server(null,"192.168.1.14","Red Hat Entreprise Linux","64 GB","Mail Server","http://localhost:8000/server/image/server4.png",Status.SERVER_DOWN));
//		};
//	}

}
