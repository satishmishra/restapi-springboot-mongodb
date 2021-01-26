package restapi.springboot.mongo.repositories;

import restapi.springboot.mongo.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String> {
	
  Pets findBy_id(ObjectId _id);
  
}